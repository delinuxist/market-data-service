package com.tradingengine.marketdataservice.dtos;


public record MarketDataDto (
     String TICKER,
     int SELL_LIMIT,
     double LAST_TRADED_PRICE,
     double MAX_PRICE,
     double ASK_PRICE,
     double BID_PRICE,
     int BUY_LIMIT

)
{}
