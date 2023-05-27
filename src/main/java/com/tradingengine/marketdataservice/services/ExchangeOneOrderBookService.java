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
public class ExchangeOneOrderBookService {
    @Autowired
    FetchExchangeDataFromAPI fetchExchangeDataFromAPI;


    public  List<ProductDto> getAppleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.APPLE.getExchangeOneUrl());
    }

    public List<ProductDto> getMicrosoftData() {
        return  fetchExchangeDataFromAPI.getOpenOrders(ProductType.MICROSOFT.getExchangeOneUrl());
    }

    public List<ProductDto> getNetflixData() {
       return fetchExchangeDataFromAPI.getOpenOrders(ProductType.NETFLIX.getExchangeOneUrl());
    }

    public List<ProductDto> getOracleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.ORACLE.getExchangeOneUrl());
    }

    public List<ProductDto> getTeslaData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.TESLA.getExchangeOneUrl());
    }

    public List<ProductDto> getIBMData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.IBM.getExchangeOneUrl());
    }

    public List<ProductDto> getGoogleData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.GOOGLE.getExchangeOneUrl());
    }

    public List<ProductDto> getAmazonData() {
        return fetchExchangeDataFromAPI.getOpenOrders(ProductType.AMAZON.getExchangeOneUrl());
    }

    public List<MarketDataDto> getMarketData() {
        return fetchExchangeDataFromAPI.getMarketData(ExchangeUrls.ExchangeOneProductsUrl.getUrl());
    }

}
