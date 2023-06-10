package com.tradingengine.marketdataservice.repositories;

import com.tradingengine.marketdataservice.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StockRepository extends JpaRepository<Stock, UUID> {

    List<Stock> findAllByTICKER(String ticker);
}
