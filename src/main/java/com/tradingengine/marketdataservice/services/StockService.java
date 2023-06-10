package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.models.Stock;

import java.util.List;

public interface StockService {

    List<MarketDataDto> saveStocks();

    List<Stock> getStocksByTicker(String ticker);
}
