package com.tradingengine.marketdataservice.integrations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.dtos.FullOrderBookDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ExchangeTwoFullOrderBookIntegration {
    private final ObjectMapper mapper;
    private final RestTemplate restTemplate;

    private final String ExchangeUrl;

    public ExchangeTwoFullOrderBookIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${order-service.exchange.two}")
            String exchange
    ) {
        this.mapper = mapper;
        this.restTemplate = restTemplate;
        ExchangeUrl = exchange + "/orderbook/";

    }

    public List<FullOrderBookDto> getOpenOrders() {
        return restTemplate.exchange(ExchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<FullOrderBookDto>>() {
                }).getBody();
    }
}