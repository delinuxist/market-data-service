package com.tradingengine.marketdataservice.services;

import com.tradingengine.marketdataservice.models.OrderModel;
import com.tradingengine.marketdataservice.models.Product;
import com.tradingengine.marketdataservice.repositories.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBookService {

    @Autowired
    private AppleRepository appleRepository;

    public Iterable<OrderModel> getOrderBooks() {
        return appleRepository.findAll();
    }



}
