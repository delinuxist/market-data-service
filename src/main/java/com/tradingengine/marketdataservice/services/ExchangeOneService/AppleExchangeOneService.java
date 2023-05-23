package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.AmazonExchangeOneIntegration;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.AppleExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppleExchangeOneService {
    private final AppleExchangeOneIntegration appleExchangeOneIntegration;

    public AppleExchangeOneService(AppleExchangeOneIntegration appleExchangeOneIntegration) {
        this.appleExchangeOneIntegration = appleExchangeOneIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return appleExchangeOneIntegration.getOpenOrders();
    }
}