package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.*;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeTwoOrderBookService {
    @Autowired
    private AmazonExchangeTwoIntegration amazonExchangeTwoIntegration;
    @Autowired
    private AppleExchangeTwoIntegration appleExchangeTwoIntegration;
    @Autowired
    private MicrosoftExchangeTwoIntegration microsoftExchangeTwoIntegration;
    @Autowired
    private NetflixExchangeTwoIntegration netflixExchangeTwoIntegration;
    @Autowired
    private OracleExchangeTwoIntegration oracleExchangeTwoIntegration;
    @Autowired
    private TeslaExchangeTwoIntegration teslaExchangeTwoIntegration;
    @Autowired
    private GoogleExchangeTwoIntegration googleExchangeTwoIntegration;
    @Autowired
    private IBMExchangeTwoIntegration ibmExchangeTwoIntegration;

    public  List<OrderDto> getAppleData() {
        return appleExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getMicrosoftData() {
        return  microsoftExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getNetflixData() {
        return netflixExchangeTwoIntegration.getOpenOrders();
    }

    public List<OrderDto> getOracleData() { return oracleExchangeTwoIntegration.getOpenOrders();
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
        return amazonExchangeTwoIntegration.getOpenOrders();
    }

}
