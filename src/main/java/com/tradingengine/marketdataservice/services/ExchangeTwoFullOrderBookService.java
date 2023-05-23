package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.FullOrderBookDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoFullOrderBookIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExchangeTwoFullOrderBookService {
    private final ExchangeTwoFullOrderBookIntegration exchangeTwoFullOrderBookIntegration;

    public ExchangeTwoFullOrderBookService(ExchangeTwoFullOrderBookIntegration exchangeTwoFullOrderBookIntegration) {
        this.exchangeTwoFullOrderBookIntegration = exchangeTwoFullOrderBookIntegration;
    }


    public List<FullOrderBookDto> getOrderBooks() {
        return exchangeTwoFullOrderBookIntegration.getOpenOrders();
    }
}
