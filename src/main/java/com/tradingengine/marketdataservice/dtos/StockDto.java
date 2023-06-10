package com.tradingengine.marketdataservice.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record StockDto(
        String TICKER,
         Integer SELL_LIMIT,
        Double LAST_TRADED_PRICE,
        Double MAX_PRICE,
        Double ASK_PRICE,
        Double BID_PRICE,
        Integer BUY_LIMIT,
        LocalDateTime timestamp

)
{}
