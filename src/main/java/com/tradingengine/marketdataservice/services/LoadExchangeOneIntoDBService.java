package com.tradingengine.marketdataservice.services;


import com.tradingengine.marketdataservice.models.OrderModel;
import com.tradingengine.marketdataservice.repositories.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadExchangeOneIntoDBService {
    @Autowired
    private ExchangeOneOrderbook exchangeOneOrderbook;

    @Autowired
    private AppleRepository appleRepository;


    public void getAppleOrders() {
        List<OrderModel> data = exchangeOneOrderbook.getAppleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> OrderModel
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                 .toList();
        appleRepository.deleteAllByExchangeUrl("https//exchange.matraining.com");
        appleRepository.saveAll(data);
    }

}
