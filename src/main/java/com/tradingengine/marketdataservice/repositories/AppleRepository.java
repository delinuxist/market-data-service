package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.OrderModel;
import com.tradingengine.marketdataservice.models.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AppleRepository extends ElasticsearchRepository<OrderModel, String> {
    void deleteAllByExchangeUrl(String id);
}
