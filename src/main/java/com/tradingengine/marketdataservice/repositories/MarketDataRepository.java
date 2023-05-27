package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.MarketData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface MarketDataRepository extends ElasticsearchRepository<MarketData, String> {
    void deleteAllByExchangeUrl(String url);
}
