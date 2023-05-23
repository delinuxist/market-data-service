package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeOneOrderbook {

    @Autowired
    private AmazonExchangeOneIntegration amazonExchangeOneIntegration;
    @Autowired
    private AppleExchangeOneIntegration appleExchangeOneIntegration;
    private MicrosoftExchangeOneIntegration microsoftExchangeOneIntegration;
    private NetflixExchangeOneIntegration netflixExchangeOneIntegration;
    private OracleExchangeOneIntegration oracleExchangeOneIntegration;
    private TeslaExchangeOneIntegration teslaExchangeOneIntegration;
    private GoogleExchangeOneIntegration googleExchangeOneIntegration;
    private IBMExchangeOneIntegration ibmExchangeOneIntegration;

    public  List<OrderDto> getAppleData() {
        return appleExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getMicrosoftData() {
        return  microsoftExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getNetflixData() {
        return netflixExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getOracleData() {
        return oracleExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getTeslaData() {
        return teslaExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getIBMData() {
        return ibmExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getGoogleData() {
        return googleExchangeOneIntegration.getOpenOrders();
    }

    public List<OrderDto> getAmazonData() {
        return amazonExchangeOneIntegration.getOpenOrders();
    }

}
