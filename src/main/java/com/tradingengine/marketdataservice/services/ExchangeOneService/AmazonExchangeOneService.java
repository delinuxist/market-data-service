package com.tradingengine.marketdataservice.services.ExchangeOneService;


import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.AmazonExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonExchangeOneService {
    private final AmazonExchangeOneIntegration amazonExchangeOneIntegration;

    public AmazonExchangeOneService(AmazonExchangeOneIntegration amazonExchangeOneIntegration) {
        this.amazonExchangeOneIntegration = amazonExchangeOneIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return amazonExchangeOneIntegration.getOpenOrders();
    }
}
