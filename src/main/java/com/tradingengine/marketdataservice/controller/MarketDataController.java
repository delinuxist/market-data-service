package com.tradingengine.marketdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class MarketDataController {

    @GetMapping
    public String test() {
        return "MarketData Service";
    }
}
