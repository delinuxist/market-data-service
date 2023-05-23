package com.tradingengine.marketdataservice.repositories;


import com.tradingengine.marketdataservice.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
