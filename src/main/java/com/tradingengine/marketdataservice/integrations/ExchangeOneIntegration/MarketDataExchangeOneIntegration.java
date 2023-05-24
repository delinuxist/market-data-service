package com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class MarketDataExchangeOneIntegration {
    private final RestTemplate restTemplate;

    private final String ExchangeUrl;

    public MarketDataExchangeOneIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${order-service.exchange.one}")
            String exchange
    ) {
        this.restTemplate = restTemplate;
        ExchangeUrl = exchange + "/pd/";

    }

    public List<MarketDataDto> getMarketData() {
        return restTemplate.exchange(ExchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<MarketDataDto>>() {}).getBody();
    }
}