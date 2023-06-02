package com.tradingengine.marketdataservice.integrations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.ProductDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class FetchExchangeDataFromAPI {
    private final RestTemplate restTemplate;

    public FetchExchangeDataFromAPI(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public List<ProductDto> getOpenOrders(String exchangeUrl) {
        return   restTemplate.exchange(exchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<ProductDto>>() {}).getBody();
    }

    public List<MarketDataDto> getMarketData(String exchangeUrl) {
        return restTemplate.exchange(exchangeUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<MarketDataDto>>
                        () {}).getBody();
    }

}
