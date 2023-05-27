package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Oracle;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OracleRepository extends  ProductRepository<Oracle> {

}
