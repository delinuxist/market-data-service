package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Microsoft;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface MicrosoftRepository extends ProductRepository <Microsoft>{
    void deleteAllByExchangeUrl(String url);
}
