package com.tradingengine.marketdataservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;




public record OrderDto(
        String product,
        int quantity,
        double price,
        String side,
        List<ExecutionDto> executions,
        String orderType,
        int cumulativeQuantity,
        int cumulativePrice,
        String exchangeUrl
){

}
