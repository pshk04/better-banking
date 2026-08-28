package io.betterbanking.repository;

import com.acme.banking.model.OBReadTransaction6;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.betterbanking.adapters.acme.OBTransactionAdapter;
import io.betterbanking.entity.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Mono;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;

@Slf4j
@Repository
public class RESTTransactionsAPIClient implements TransactionApiClient {

    @Value("${testnet.integration.client}")
    private String clientId;
    @Value("${testnet.integration.secret}")
    private String secret;

    @Autowired
    private final WebClient client;
    private final OBTransactionAdapter adapter = new OBTransactionAdapter();

    @Autowired
    public RESTTransactionsAPIClient(final WebClient client) {
        this.client = client;
    }

    @Override
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber){
        OBReadTransaction6 res = null;
        String encodedClientData = Base64.getEncoder().encodeToString(String.format("%s:%s", clientId, secret).getBytes());

        System.out.println("CLient: "+client.get().toString());
        try {
            res = client
                    .post()
                    .uri("/oauth/token")
                    .header("Authorization", "Basic " + encodedClientData)
                    .body(BodyInserters.fromFormData("grant_type", "client_credentials"))
                    .retrieve()
                    .bodyToMono(String.class)
                    .flatMap(rawJson -> {
                        try {
                            String accessTokenValue = new ObjectMapper().readTree(rawJson).get("access_token").textValue();
                            return client.get()
                                    .uri("accounts/" + accountNumber + "/transactions")
                                    .headers(h -> h.setBearerAuth(accessTokenValue))
                                    .retrieve()
                                    .bodyToMono(OBReadTransaction6.class);
                        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
                            // Forward the checked exception down the reactive pipeline cleanly
                            return Mono.error(e);
                        }
                    })
                    .block();
        } catch (Exception ex) {
            log.error("failed to retrieve account information due to the following reason {}", ex.getMessage());
            throw ex;
        }

        if (res == null || res.getData() == null) {
            return Collections.emptyList();
        }

        return res.getData()
                .getTransaction()
                .stream()
                .map(adapter::adapt)
                .collect(toList());
    }
}
