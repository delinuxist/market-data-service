package com.tradingengine.marketdataservice.services.ExchangeTwoService;


import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.AmazonExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonExchangeTwoService {
    private final AmazonExchangeTwoIntegration amazonExchangeTwoIntegration;

    public AmazonExchangeTwoService(AmazonExchangeTwoIntegration amazonExchangeTwoIntegration) {
        this.amazonExchangeTwoIntegration = amazonExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return amazonExchangeTwoIntegration.getOpenOrders();
    }
}
