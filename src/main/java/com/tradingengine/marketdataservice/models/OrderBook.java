package com.tradingengine.marketdataservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderBook {
    @Id
    @GeneratedValue
    private UUID id;
    private String product;
    private double price;

    private int quantity;
    private String side;

    private String exchangeURL;
}
