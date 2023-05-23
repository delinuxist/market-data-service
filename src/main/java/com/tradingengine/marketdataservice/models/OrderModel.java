package com.tradingengine.marketdataservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "orderbook")
public class OrderModel {

    @Id
    @GeneratedValue
    private String id;
    private String product;
    private int quantity;
    private double price;
    private String side;
    private int cumulativeQuantity;
    private double cumulativePrice;
    private String orderType;

    private String exchangeUrl;
}
