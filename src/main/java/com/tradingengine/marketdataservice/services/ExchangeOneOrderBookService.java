package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeUrls;
import com.tradingengine.marketdataservice.integrations.FetchExchangeDataFromAPIIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeOneOrderBookService {
    @Autowired
    FetchExchangeDataFromAPIIntegration fetchExchangeDataFromAPIIntegration;


    public  List<OrderDto> getAppleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.AppleExchangeOne.getUrl());
    }

    public List<OrderDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.MicrosoftExchangeOne.getUrl());
    }

    public List<OrderDto> getNetflixData() {
       return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.NetflixExchangeOne.getUrl());
    }

    public List<OrderDto> getOracleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.OracleExchangeOne.getUrl());
    }

    public List<OrderDto> getTeslaData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.TeslaExchangeOne.getUrl());
    }

    public List<OrderDto> getIBMData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.IBMExchangeOne.getUrl());
    }

    public List<OrderDto> getGoogleData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.GoogleExchangeOne.getUrl());
    }

    public List<OrderDto> getAmazonData() {
        return fetchExchangeDataFromAPIIntegration.getOpenOrders(ExchangeUrls.AmazonExchangeOne.getUrl());
    }

    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPIIntegration.getMarketData(ExchangeUrls.ExchangeOneProductsUrl.getUrl());
    }

}
