package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Tesla;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TeslaRepository extends ElasticsearchRepository<Tesla, String> {
    void deleteAllByExchangeUrl(String url);
}
