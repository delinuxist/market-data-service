package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.MicrosoftExchangeTwoIntegration;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.OracleExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OracleExchangeTwoService {
    private final OracleExchangeTwoIntegration oracleExchangeTwoIntegration;

    public OracleExchangeTwoService(OracleExchangeTwoIntegration oracleExchangeTwoIntegration) {
        this.oracleExchangeTwoIntegration = oracleExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return oracleExchangeTwoIntegration.getOpenOrders();
    }
}