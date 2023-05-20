package com.tradingengine.marketdataservice.intergration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.models.FullOrderBook;
import com.tradingengine.marketdataservice.models.OrderBook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ExchangeOneIntegration {

    private final ObjectMapper mapper;
    private final RestTemplate restTemplate;

    private final String ExchangeUrl;

    public ExchangeOneIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("order-service.exchange.one")
            String exchange
    ) {
        this.mapper = mapper;
        this.restTemplate = restTemplate;
        ExchangeUrl = "http://" + exchange + "/orderbook/";

    }

    public ResponseEntity<FullOrderBook> getOpenOrders() {
//        Try Catch
        return restTemplate.getForEntity(ExchangeUrl, FullOrderBook.class);
    }




}
