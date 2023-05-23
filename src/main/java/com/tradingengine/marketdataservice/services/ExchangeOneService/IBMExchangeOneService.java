package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.IBMExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBMExchangeOneService {
    private final IBMExchangeOneIntegration ibmExchangeOneIntegration;

    public IBMExchangeOneService(IBMExchangeOneIntegration ibmExchangeOneIntegration) {
        this.ibmExchangeOneIntegration = ibmExchangeOneIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return ibmExchangeOneIntegration.getOpenOrders();
    }
}