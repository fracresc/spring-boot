package com.switchfully.maven.exchange.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {TestApplication.class})
class StockExchangeControllerIntegrationTest {

    @Autowired
    private StockExchangeController controller;

    @Test
    void givenAnId_whenRequestController_thenReturnTheStockDto() {
        String id = "AA";
        StockDto stockDto = controller.getStock(id);

        Assertions.assertEquals("Ambro AN", stockDto.getName());
    }
}