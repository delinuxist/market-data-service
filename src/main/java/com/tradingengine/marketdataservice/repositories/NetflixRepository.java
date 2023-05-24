package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Netflix;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface NetflixRepository extends ElasticsearchRepository<Netflix, String> {
    void deleteAllByExchangeUrl(String url);
}
