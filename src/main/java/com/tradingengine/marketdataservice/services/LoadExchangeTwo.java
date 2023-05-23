package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.*;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadExchangeTwo {
    @Autowired
    private AmazonExchangeTwoIntegration amazonExchangeTwoIntegration;
    private AppleExchangeTwoIntegration appleExchangeTwoIntegration;
    private MicrosoftExchangeTwoIntegration microsoftExchangeTwoIntegration;
    private NetflixExchangeTwoIntegration netflixExchangeTwoIntegration;
    private OracleExchangeTwoIntegration oracleExchangeTwoIntegration;
    private TeslaExchangeTwoIntegration teslaExchangeTwoIntegration;
    private GoogleExchangeTwoIntegration googleExchangeTwoIntegration;
    private IBMExchangeTwoIntegration ibmExchangeTwoIntegration;

    public List<OrderDto> getAppleData() {
        return appleExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getMicrosoftData() {
        return  microsoftExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getNetflixData() {
        return netflixExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getOracleData() {
        return oracleExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getTeslaData() {
        return teslaExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getIBMData() {
        return ibmExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getGoogleData() {
        return googleExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getAmazonData() {
        return appleExchangeTwoIntegration.getOpenOrders();
    }

}
