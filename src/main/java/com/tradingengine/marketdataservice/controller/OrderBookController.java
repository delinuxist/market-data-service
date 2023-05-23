package com.tradingengine.marketdataservice.controller;


import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.models.OrderModel;
import com.tradingengine.marketdataservice.models.Product;
import com.tradingengine.marketdataservice.services.LoadExchangeOneIntoDBService;
import com.tradingengine.marketdataservice.services.OrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market/elastic")
public class OrderBookController {

    @Autowired
    private OrderBookService orderBookService;

    @Autowired
    private LoadExchangeOneIntoDBService loadExchangeOneIntoDBService;
    @GetMapping("/findAll")
    Iterable<OrderModel> findAll(){
        loadExchangeOneIntoDBService.getAppleOrders();
        return orderBookService.getOrderBooks();

    }

}

