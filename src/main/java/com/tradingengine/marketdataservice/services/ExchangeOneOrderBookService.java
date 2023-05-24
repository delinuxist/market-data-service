package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeUrls;
import com.tradingengine.marketdataservice.integrations.FetchExchangeDataFromAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeOneOrderBookService {
    @Autowired
    FetchExchangeDataFromAPI fetchExchangeDataFromAPI;


    public  List<OrderDto> getAppleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.AppleExchangeOne.getUrl());
    }

    public List<OrderDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.MicrosoftExchangeOne.getUrl());
    }

    public List<OrderDto> getNetflixData() {
       return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.NetflixExchangeOne.getUrl());
    }

    public List<OrderDto> getOracleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.OracleExchangeOne.getUrl());
    }

    public List<OrderDto> getTeslaData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.TeslaExchangeOne.getUrl());
    }

    public List<OrderDto> getIBMData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.IBMExchangeOne.getUrl());
    }

    public List<OrderDto> getGoogleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.GoogleExchangeOne.getUrl());
    }

    public List<OrderDto> getAmazonData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ExchangeUrls.AmazonExchangeOne.getUrl());
    }

    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPI.getMarketData(ExchangeUrls.ExchangeOneProductsUrl.getUrl());
    }

}
