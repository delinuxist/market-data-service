package com.tradingengine.marketdataservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto{
    private String product;
    private int quantity;
    private double price;
    private String side;
    private List<ExecutionDto> executions;
    private String orderType;
    private int cumulativeQuantity;
    private int cumulativePrice;
}
