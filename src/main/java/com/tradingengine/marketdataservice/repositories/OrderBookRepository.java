package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.OrderBook;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderBookRepository extends CrudRepository<OrderBook, UUID> {
}
