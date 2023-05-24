package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeUrls;
import com.tradingengine.marketdataservice.integrations.FetchExchangeDataFromAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeTwoOrderBookService {
   @Autowired
   FetchExchangeDataFromAPI fetchExchangeDataFromAPI;

    public  List<OrderDto> getAppleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.AppleExchangeTwo.getUrl());
    }

    public List<OrderDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.MicrosoftExchangeTwo.getUrl());
    }

    public List<OrderDto> getNetflixData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.NetflixExchangeTwo.getUrl());
    }

    public List<OrderDto> getOracleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.OracleExchangeTwo.getUrl()); }

    public List<OrderDto> getTeslaData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.TeslaExchangeTwo.getUrl());
    }

    public List<OrderDto> getIBMData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.IBMExchangeTwo.getUrl());
    }

    public List<OrderDto> getGoogleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.GoogleExchangeTwo.getUrl());
    }

    public List<OrderDto> getAmazonData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.AmazonExchangeTwo.getUrl());
    }
    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPI.getMarketData(ExchangeUrls.ExchangeTwoProductsUrl.getUrl());
    }

}
