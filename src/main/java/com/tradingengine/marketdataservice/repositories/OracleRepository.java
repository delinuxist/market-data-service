package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Oracle;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OracleRepository extends ElasticsearchRepository<Oracle, String> {
    void deleteAllByExchangeUrl(String url);
}
