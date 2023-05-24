package com.tradingengine.marketdataservice.controller;
import com.tradingengine.marketdataservice.models.OrderModel;
import com.tradingengine.marketdataservice.services.ExchangeOneService.LoadExchangeOneIntoDBService;
import com.tradingengine.marketdataservice.services.ExchangeTwoService.LoadExchangeTwoIntoDBService;
import com.tradingengine.marketdataservice.services.OrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market/elastic")
public class OrderBookController {

    @Autowired
    private OrderBookService orderBookService;

    @Autowired
    private LoadExchangeOneIntoDBService loadExchangeOneIntoDBService;

    @Autowired
    private LoadExchangeTwoIntoDBService loadExchangeTwoIntoDBService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public void loadOpenTrades(){
        loadExchangeTwo();
        loadExchangeOne();
    }
    @GetMapping("/findAll")
   public Iterable<OrderModel> findAll(){
        return orderBookService.getAppleData();
    }

    private void loadExchangeOne() {
        loadExchangeOneIntoDBService.getAmazonTrades();
        loadExchangeOneIntoDBService.getGoogleTrades();
        loadExchangeOneIntoDBService.getAppleTrades();
        loadExchangeOneIntoDBService.getIBMTrades();
        loadExchangeOneIntoDBService.getTeslaTrades();
        loadExchangeOneIntoDBService.getOracleTrades();
        loadExchangeOneIntoDBService.getMicrosoftTrades();
        loadExchangeOneIntoDBService.getNetflixTrades();
        loadExchangeOneIntoDBService.getMarketData();
    }

    private void loadExchangeTwo() {
        loadExchangeTwoIntoDBService.getAmazonTrades();
        loadExchangeTwoIntoDBService.getGoogleTrades();
        loadExchangeTwoIntoDBService.getAppleTrades();
        loadExchangeTwoIntoDBService.getIBMTrades();
        loadExchangeTwoIntoDBService.getTeslaTrades();
        loadExchangeTwoIntoDBService.getOracleTrades();
        loadExchangeTwoIntoDBService.getMicrosoftTrades();
        loadExchangeTwoIntoDBService.getNetflixTrades();
        loadExchangeTwoIntoDBService.getMarketData();
    }

}

