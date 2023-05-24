package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.MarketDataExchangeOneIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeOneMarketDataService {

    @Autowired
    MarketDataExchangeOneIntegration marketDataExchangeOneIntegration;

    public ExchangeOneMarketDataService(MarketDataExchangeOneIntegration marketDataExchangeOneIntegration) {
        this.marketDataExchangeOneIntegration = marketDataExchangeOneIntegration;
    }

    public List<MarketDataDto> getMarketData() {
        return marketDataExchangeOneIntegration.getMarketData();
    }
}



