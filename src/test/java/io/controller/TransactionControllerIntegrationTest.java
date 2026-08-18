package io.controller;

import io.BetterBankingApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest(classes = {BetterBankingApplication.class})
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTransactions() throws Exception{
        mockMvc.perform(get("/api/v1/transactions/1")).andExpect(status().isOk());
    }


}
