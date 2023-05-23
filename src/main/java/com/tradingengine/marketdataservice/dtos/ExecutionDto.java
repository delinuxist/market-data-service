package com.tradingengine.marketdataservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
public record ExecutionDto(
     LocalDateTime timestamp,
     double price,
     int quantity
){}
