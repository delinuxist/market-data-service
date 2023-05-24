package com.tradingengine.marketdataservice.integrations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FetchExchangeDataFromAPIIntegration {
    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

    public FetchExchangeDataFromAPIIntegration(RestTemplate restTemplate, ObjectMapper mapper) {
        this.restTemplate = restTemplate;
        this.mapper = mapper;
    }

    public List<OrderDto> getOpenOrders(String exchangeUrl) {
        return   restTemplate.exchange(exchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<OrderDto>>() {}).getBody();
    }

    public List<MarketDataDto> getMarketData(String exchangeUrl) {
        return restTemplate.exchange(exchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<MarketDataDto>>() {}).getBody();
    }

}
