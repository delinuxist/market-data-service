package com.tradingengine.marketdataservice.controller;

import com.tradingengine.marketdataservice.dtos.FullOrderBookDto;
import com.tradingengine.marketdataservice.services.ExchangeOneFullOrderBookService;
import com.tradingengine.marketdataservice.services.ExchangeTwoFullOrderBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/market")
@RequiredArgsConstructor
public class MarketDataController {
    private final ExchangeTwoFullOrderBookService exchangeTwoFullOrderBookService;
    private final ExchangeOneFullOrderBookService exchangeOneFullOrderBookService;

    @GetMapping("/one")
    @ResponseStatus(HttpStatus.OK)
    public List<FullOrderBookDto> exchangeOneOpenTrades() {
        return exchangeOneFullOrderBookService.getOrderBooks();
    }

    @GetMapping("/two")
    @ResponseStatus(HttpStatus.OK)
    public List<FullOrderBookDto> exchangeTwoOpenTrades() {
        return exchangeTwoFullOrderBookService.getOrderBooks();
    }

}
