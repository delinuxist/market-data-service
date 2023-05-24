package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.MarketDataExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExchangeTwoMarketDataService {
    private final MarketDataExchangeTwoIntegration marketDataExchangeTwoIntegration;

    public ExchangeTwoMarketDataService(MarketDataExchangeTwoIntegration marketDataExchangeTwoIntegration) {
        this.marketDataExchangeTwoIntegration = marketDataExchangeTwoIntegration;
    }


    public List<MarketDataDto> getMarketData() {
        return marketDataExchangeTwoIntegration.getMarketData();
    }
}
