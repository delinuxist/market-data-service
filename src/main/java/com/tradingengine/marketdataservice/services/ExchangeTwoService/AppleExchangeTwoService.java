package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.AppleExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class AppleExchangeTwoService {
    private final AppleExchangeTwoIntegration appleExchangeTwoIntegration;

    public AppleExchangeTwoService(AppleExchangeTwoIntegration appleExchangeTwoIntegration) {
        this.appleExchangeTwoIntegration = appleExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return appleExchangeTwoIntegration.getOpenOrders();
    }
}

