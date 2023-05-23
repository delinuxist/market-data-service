package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.GoogleExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoogleExchangeOneService {
    private final GoogleExchangeOneIntegration googleExchangeOneIntegration;

    public GoogleExchangeOneService(GoogleExchangeOneIntegration googleExchangeOneIntegration) {
        this.googleExchangeOneIntegration = googleExchangeOneIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return googleExchangeOneIntegration.getOpenOrders();
    }
}
