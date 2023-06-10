package com.tradingengine.marketdataservice.services.impl;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.models.Stock;
import com.tradingengine.marketdataservice.repositories.StockRepository;
import com.tradingengine.marketdataservice.services.ExchangeOneOrderBookService;
import com.tradingengine.marketdataservice.services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final ExchangeOneOrderBookService exchangeOneOrderBookService;

    private final StockRepository stockRepository;



    @Override
    public List<MarketDataDto> saveStocks() {
        List<MarketDataDto> marketData = exchangeOneOrderBookService.getMarketData();
        marketData.forEach(data ->{
            Stock stock = Stock.builder()
                    .MAX_PRICE_SHIFT(data.MAX_PRICE_SHIFT())
                    .BUY_LIMIT(data.BUY_LIMIT())
                    .TICKER(data.TICKER())
                    .SELL_LIMIT(data.SELL_LIMIT())
                    .LAST_TRADED_PRICE(data.LAST_TRADED_PRICE())
                    .BID_PRICE(data.BID_PRICE())
                    .ASK_PRICE(data.ASK_PRICE())
                    .timestamp(LocalDateTime.now())
                    .build();
            stockRepository.save(stock);
        });
        return marketData;
    }

    @Override
    public List<Stock> getStocksByTicker(String ticker) {
        return stockRepository.findAllByTICKER(ticker);
    }
}
