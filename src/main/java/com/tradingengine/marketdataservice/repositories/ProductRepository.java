package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ProductRepository<T extends Product> extends ElasticsearchRepository<T, String>  {
    void deleteAllByExchangeUrl(String url);
}
