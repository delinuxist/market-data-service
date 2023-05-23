package com.tradingengine.marketdataservice.repositories;


import com.tradingengine.marketdataservice.models.OrderModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OrderBookRepository extends ElasticsearchRepository<OrderModel, String> {
    void deleteAllByExchangeUrl(String exchangeUrl);

}
