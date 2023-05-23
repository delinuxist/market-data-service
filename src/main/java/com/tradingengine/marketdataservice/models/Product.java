package com.tradingengine.marketdataservice.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product{
    @Id
    @GeneratedValue
    private UUID id;
    private String product;
    private int quantity;
    private double price;
    private String side;
    private String exchangeURL;
    private int cumulativeQuantity;
    private double cumulativePrice;
    private String orderType;
}

