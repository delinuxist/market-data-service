package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.FullOrderBookDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneFullOrderBookIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExchangeOneFullOrderBookService {
    private final ExchangeOneFullOrderBookIntegration exchangeOneFullOrderBookIntegration;

    public ExchangeOneFullOrderBookService(ExchangeOneFullOrderBookIntegration exchangeOneFullOrderBookIntegration) {
        this.exchangeOneFullOrderBookIntegration = exchangeOneFullOrderBookIntegration;
    }


    public List<FullOrderBookDto> getOrderBooks() {
        return exchangeOneFullOrderBookIntegration.getOpenOrders();
    }
}
