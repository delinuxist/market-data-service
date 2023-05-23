package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.integrations.ExchangeOneIntegration.NetflixExchangeOneIntegration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetflixExchangeOneService {
    private final NetflixExchangeOneIntegration netflixExchangeOneIntegration;

    public NetflixExchangeOneService(NetflixExchangeOneIntegration netflixExchangeOneIntegration) {
        this.netflixExchangeOneIntegration = netflixExchangeOneIntegration;
    }


    public List<OrderDto> getOrderBooks() {
        return netflixExchangeOneIntegration.getOpenOrders();
    }
}