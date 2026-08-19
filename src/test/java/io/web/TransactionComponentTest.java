package io.web;

import io.BetterBankingApplication;
import io.betterbanking.repository.TransactionRepository;
import io.betterbanking.web.TransactionController;
import io.betterbanking.service.TransactionService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@SpringBootTest(classes = {BetterBankingApplication.class})
public class TransactionComponentTest {
    @LocalServerPort
    private int port;

    @Mock
    private TransactionController transactionController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testApplicationEndToEnd(){
        given().standaloneSetup(transactionController)
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/1", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
