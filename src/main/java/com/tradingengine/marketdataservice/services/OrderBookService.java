package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.models.OrderModel;

import com.tradingengine.marketdataservice.repositories.OrderBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBookService {

    @Autowired
    private OrderBookRepository orderBookRepository;

    public Iterable<OrderModel> getAppleData() {
        return orderBookRepository.findAll();
    }




}
