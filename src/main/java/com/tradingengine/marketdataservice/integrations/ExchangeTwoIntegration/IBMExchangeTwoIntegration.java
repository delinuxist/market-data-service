package com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class IBMExchangeTwoIntegration {
    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

    private final String ExchangeUrl;

    public IBMExchangeTwoIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${order-service.exchange.two}")
            String exchange
    ) {
        this.restTemplate = restTemplate;
        this.mapper = mapper;
        ExchangeUrl = exchange + "/orderbook/IBM/open";
    }

    public List<OrderDto> getOpenOrders() {
        return   restTemplate.exchange(ExchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<OrderDto>>() {}).getBody();

    }
}