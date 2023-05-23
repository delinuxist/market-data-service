package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.MicrosoftExchangeOneIntegration;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MicrosoftExchangeOneService {
    private final MicrosoftExchangeOneIntegration microsoftExchangeOneIntegration;

    public MicrosoftExchangeOneService(MicrosoftExchangeOneIntegration microsoftExchangeOneIntegration) {
        this.microsoftExchangeOneIntegration = microsoftExchangeOneIntegration;
    }


    public List<OrderDto> getOrderBooks() {
        return microsoftExchangeOneIntegration.getOpenOrders();
    }
}