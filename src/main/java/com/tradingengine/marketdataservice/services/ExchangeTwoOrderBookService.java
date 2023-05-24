package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeUrls;
import com.tradingengine.marketdataservice.integrations.FetchExchangeDataFromAPIIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeTwoOrderBookService {
   @Autowired
   FetchExchangeDataFromAPIIntegration fetchExchangeDataFromAPIIntegration;

    public  List<OrderDto> getAppleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.AppleExchangeTwo.getUrl());
    }

    public List<OrderDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.MicrosoftExchangeTwo.getUrl());
    }

    public List<OrderDto> getNetflixData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.NetflixExchangeTwo.getUrl());
    }

    public List<OrderDto> getOracleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.OracleExchangeTwo.getUrl()); }

    public List<OrderDto> getTeslaData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.TeslaExchangeTwo.getUrl());
    }

    public List<OrderDto> getIBMData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.IBMExchangeTwo.getUrl());
    }

    public List<OrderDto> getGoogleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.GoogleExchangeTwo.getUrl());
    }

    public List<OrderDto> getAmazonData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.AmazonExchangeTwo.getUrl());
    }
    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPIIntegration.getMarketData(ExchangeUrls.ExchangeTwoProductsUrl.getUrl());
    }

}
