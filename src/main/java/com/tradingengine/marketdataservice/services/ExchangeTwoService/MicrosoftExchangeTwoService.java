package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.GoogleExchangeTwoIntegration;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.MicrosoftExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MicrosoftExchangeTwoService {
    private final MicrosoftExchangeTwoIntegration microsoftExchangeTwoIntegration;

    public MicrosoftExchangeTwoService(MicrosoftExchangeTwoIntegration microsoftExchangeTwoIntegration) {
        this.microsoftExchangeTwoIntegration = microsoftExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return microsoftExchangeTwoIntegration.getOpenOrders();
    }
}