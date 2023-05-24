package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Apple;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AppleRepository extends ElasticsearchRepository<Apple, String> {
    void deleteAllByExchangeUrl(String url);

}
