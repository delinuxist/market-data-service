package com.tradingengine.marketdataservice.controller;

import com.tradingengine.marketdataservice.dtos.MarketDataDto;
import com.tradingengine.marketdataservice.models.Stock;
import com.tradingengine.marketdataservice.services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/market")
@RequiredArgsConstructor
public class MarketDataController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    private final StockService stockService;

    @PostMapping ("/exchange")
    public void updateStockExchange() {
        List<MarketDataDto> data = stockService.saveStocks();
        simpMessagingTemplate.convertAndSend("/exchangeResponse",data);
    }

    @PostMapping("/getStock")
    public ResponseEntity<List<Stock>> getStockByTicker(@RequestBody() String ticker) {
        return ResponseEntity.of(Optional.ofNullable(stockService.getStocksByTicker(ticker)));
    }
}
