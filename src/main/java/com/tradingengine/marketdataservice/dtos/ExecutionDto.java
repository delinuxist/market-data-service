package com.tradingengine.marketdataservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExecutionDto {
    private LocalDateTime timestamp;
    private double price;
    private int quantity;
}
