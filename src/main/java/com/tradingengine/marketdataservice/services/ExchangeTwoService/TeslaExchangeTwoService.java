package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.TeslaExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeslaExchangeTwoService {
    private final TeslaExchangeTwoIntegration teslaExchangeTwoIntegration;

    public TeslaExchangeTwoService(TeslaExchangeTwoIntegration teslaExchangeTwoIntegration) {
        this.teslaExchangeTwoIntegration = teslaExchangeTwoIntegration;
    }


    public List<OrderDto> getOrderBooks() {
        return teslaExchangeTwoIntegration.getOpenOrders();
    }
}