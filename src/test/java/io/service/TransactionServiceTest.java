package io.service;

import io.BetterBankingApplication;
import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.MerchantDetailsRepository;
import io.betterbanking.repository.TransactionApiClient;
import io.betterbanking.service.TransactionService;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.List;


@SpringBootTest(classes = {BetterBankingApplication.class})
public class TransactionServiceTest {

    @Mock private TransactionApiClient transactionApiClient;
    @Mock private MerchantDetailsRepository merchantDetailsRepository;
    @InjectMocks
    private TransactionService transactionService;

    @DisplayName("test TransactionService with mock TransactionApiClient")
    @Test
    public void verifyTransactionsCount(){

        when(transactionApiClient.findAllByAccountNumber(any()))
                .thenReturn(List.of(new Transaction()));

        assertEquals(1, transactionService.findAllByAccountNumber(1).size());
    }
}
