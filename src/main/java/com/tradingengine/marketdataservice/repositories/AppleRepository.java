package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Amazon;
import com.tradingengine.marketdataservice.models.Apple;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AppleRepository extends ProductRepository<Apple> {


}
