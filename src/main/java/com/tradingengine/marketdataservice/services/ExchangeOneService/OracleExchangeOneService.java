package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.OracleExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OracleExchangeOneService {
    private final OracleExchangeOneIntegration oracleExchangeOneIntegration;

    public OracleExchangeOneService(OracleExchangeOneIntegration oracleExchangeOneIntegration) {
        this.oracleExchangeOneIntegration = oracleExchangeOneIntegration;
    }


    public List<OrderDto> getOrderBooks() {
        return oracleExchangeOneIntegration.getOpenOrders();
    }
}
