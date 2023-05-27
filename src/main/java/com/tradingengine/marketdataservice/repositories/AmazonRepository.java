package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Amazon;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AmazonRepository extends  ProductRepository<Amazon>{

}
