package com.tradingengine.marketdataservice.services.ExchangeOneService;

import com.tradingengine.marketdataservice.models.*;
import com.tradingengine.marketdataservice.repositories.MarketDataRepository;
import com.tradingengine.marketdataservice.services.OrderRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadExchangeOneIntoDBService {
    @Autowired
    ExchangeOneOrderBookService exchangeOneOrderBookService;
    @Autowired
    OrderRepositoryService orderRepositoryService;

    @Autowired
    ExchangeOneMarketDataService exchangeOneMarketDataService;

    @Autowired
    MarketDataRepository marketDataRepository;


    public void getAppleTrades() {
        List<Apple> data = exchangeOneOrderBookService.getAppleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Apple
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                 .toList();
        orderRepositoryService.getAppleRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getAppleRepository().saveAll(data);
    }

    public void getAmazonTrades() {
        List<Amazon> data = exchangeOneOrderBookService.getAmazonData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Amazon
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getAmazonRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getAmazonRepository().saveAll(data);
    }

    public void getGoogleTrades() {
        List<Google> data = exchangeOneOrderBookService.getGoogleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Google
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getGoogleRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getGoogleRepository().saveAll(data);
    }

    public void getTeslaTrades() {
        List<Tesla> data = exchangeOneOrderBookService.getTeslaData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Tesla
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getTeslaRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getTeslaRepository().saveAll(data);
    }

    public void getMicrosoftTrades() {
        List<Microsoft> data = exchangeOneOrderBookService.getMicrosoftData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Microsoft
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getMicrosoftRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getMicrosoftRepository().saveAll(data);
    }

    public void getIBMTrades() {
        List<IBM> data = exchangeOneOrderBookService.getIBMData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> IBM
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getIbmRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getIbmRepository().saveAll(data);
    }

    public void getOracleTrades() {
        List<Oracle> data = exchangeOneOrderBookService.getOracleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Oracle
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getOracleRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getOracleRepository().saveAll(data);
    }

    public void getNetflixTrades() {
        List<Netflix> data = exchangeOneOrderBookService.getNetflixData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Netflix
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange.matraining.com").build())
                .toList();
        orderRepositoryService.getNetflixRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        orderRepositoryService.getNetflixRepository().saveAll(data);
    }

    public void getMarketData() {
          List<MarketData>  marketData = exchangeOneMarketDataService.getMarketData()
                    .parallelStream()
                    .map(data -> MarketData
                            .builder()
                            .ticker(data.TICKER())
                            .sellLimit(data.SELL_LIMIT())
                            .lastTradedPrice(data.LAST_TRADED_PRICE())
                            .maxPriceShift(data.MAX_PRICE())
                            .askPrice(data.ASK_PRICE())
                            .bidPrice(data.BID_PRICE())
                            .buyLimit(data.BUY_LIMIT())
                            .exchangeUrl("https//exchange.matraining.com")
                            .build()
                    ).toList();
          marketDataRepository.deleteAllByExchangeUrl("https//exchange.matraining.com");
          marketDataRepository.saveAll(marketData);
    }


}
