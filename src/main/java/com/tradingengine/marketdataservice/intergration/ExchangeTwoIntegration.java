package com.tradingengine.marketdataservice.intergration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExchangeTwoIntegration {
    @Value("$market-service.exchange.two")
    private String exchange;
}
