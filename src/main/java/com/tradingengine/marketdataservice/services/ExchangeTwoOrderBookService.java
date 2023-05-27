package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.constants.ProductType;
import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.dtos.ProductDto;
import com.tradingengine.marketdataservice.constants.ExchangeUrls;
import com.tradingengine.marketdataservice.integrations.FetchExchangeDataFromAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeTwoOrderBookService {
   @Autowired
   FetchExchangeDataFromAPI fetchExchangeDataFromAPI;

    public  List<ProductDto> getAppleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.APPLE.getExchangeTwoUrl());
    }

    public List<ProductDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPI.getOpenOrders(ProductType.MICROSOFT.getExchangeTwoUrl());
    }

    public List<ProductDto> getNetflixData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.NETFLIX.getExchangeTwoUrl());
    }

    public List<ProductDto> getOracleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.ORACLE.getExchangeTwoUrl()); }

    public List<ProductDto> getTeslaData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.TESLA.getExchangeTwoUrl());
    }

    public List<ProductDto> getIBMData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.IBM.getExchangeTwoUrl());
    }

    public List<ProductDto> getGoogleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.GOOGLE.getExchangeTwoUrl());
    }

    public List<ProductDto> getAmazonData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.AMAZON.getExchangeTwoUrl());
    }
    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPI.getMarketData(ExchangeUrls.ExchangeTwoProductsUrl.getUrl());
    }

}
