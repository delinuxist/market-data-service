package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.TeslaExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeslaExchangeOneService {
    private final TeslaExchangeOneIntegration teslaExchangeOneIntegration;

    public TeslaExchangeOneService(TeslaExchangeOneIntegration teslaExchangeOneIntegration) {
        this.teslaExchangeOneIntegration = teslaExchangeOneIntegration;
    }


    public List<OrderDto> getOrderBooks() {
        return teslaExchangeOneIntegration.getOpenOrders();
    }
}

