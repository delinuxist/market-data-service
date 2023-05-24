package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.IBM;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IBMRepository extends ElasticsearchRepository<IBM, String> {
    void deleteAllByExchangeUrl(String url);
}
