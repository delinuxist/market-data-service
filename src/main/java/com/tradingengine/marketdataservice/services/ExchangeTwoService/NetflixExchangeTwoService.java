package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeTwoIntegration.NetflixExchangeTwoIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetflixExchangeTwoService {
    private final NetflixExchangeTwoIntegration netflixExchangeTwoIntegration;


    public NetflixExchangeTwoService(NetflixExchangeTwoIntegration netflixExchangeTwoIntegration) {
        this.netflixExchangeTwoIntegration = netflixExchangeTwoIntegration;
    }

    public List<OrderDto> getOrderBooks() {
        return netflixExchangeTwoIntegration.getOpenOrders();
    }
}
