package com.tradingengine.marketdataservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
public record FullOrderBookDto(
     List<OrderDto> fullOrderBook
){}
