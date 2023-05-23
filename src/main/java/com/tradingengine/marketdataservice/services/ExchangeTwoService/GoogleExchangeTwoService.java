package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.GoogleExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleExchangeTwoService {
    private final GoogleExchangeTwoIntegration googleExchangeTwoIntegration;

    public GoogleExchangeTwoService(GoogleExchangeTwoIntegration googleExchangeTwoIntegration) {
        this.googleExchangeTwoIntegration = googleExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return googleExchangeTwoIntegration.getOpenOrders();
    }
}
