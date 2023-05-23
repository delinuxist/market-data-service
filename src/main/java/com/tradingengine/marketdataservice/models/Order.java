package com.tradingengine.marketdataservice.models;


import com.tradingengine.marketdataservice.dtos.ExecutionDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order{
    @Id
    @GeneratedValue
    @Column(name = "id")
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

