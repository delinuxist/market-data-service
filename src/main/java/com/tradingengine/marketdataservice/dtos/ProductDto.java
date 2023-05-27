package com.tradingengine.marketdataservice.dtos;

import java.util.List;




public record ProductDto(
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
