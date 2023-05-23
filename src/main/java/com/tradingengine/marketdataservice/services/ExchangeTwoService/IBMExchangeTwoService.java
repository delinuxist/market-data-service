package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.GoogleExchangeTwoIntegration;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.IBMExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IBMExchangeTwoService {
    private final IBMExchangeTwoIntegration ibmExchangeTwoIntegration;

    public IBMExchangeTwoService(IBMExchangeTwoIntegration ibmExchangeTwoIntegration) {
        this.ibmExchangeTwoIntegration = ibmExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return ibmExchangeTwoIntegration.getOpenOrders();
    }
}