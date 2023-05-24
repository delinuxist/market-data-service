package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Google;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface GoogleRepository extends ElasticsearchRepository<Google, String> {
    void deleteAllByExchangeUrl(String url);
}
