package com.tradingengine.marketdataservice.services.ExchangeTwoService;

import com.tradingengine.marketdataservice.models.*;;
import com.tradingengine.marketdataservice.repositories.MarketDataRepository;
import com.tradingengine.marketdataservice.services.OrderRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadExchangeTwoIntoDBService {
    @Autowired
    private ExchangeTwoOrderBookService exchangeTwoOrderBookService;
    @Autowired
    private OrderRepositoryService orderRepositoryService;

    @Autowired
    private ExchangeTwoMarketDataService exchangeTwoMarketDataService;

    @Autowired
    private MarketDataRepository marketDataRepository;


    public void getAppleTrades() {
        List<Apple> data = exchangeTwoOrderBookService.getAppleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Apple
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getAppleRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getAppleRepository().saveAll(data);
    }

    public void getAmazonTrades() {
        List<Amazon> data = exchangeTwoOrderBookService.getAmazonData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Amazon
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getAmazonRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getAmazonRepository().saveAll(data);
    }

    public void getGoogleTrades() {
        List<Google> data = exchangeTwoOrderBookService.getGoogleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Google
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getGoogleRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getGoogleRepository().saveAll(data);
    }

    public void getTeslaTrades() {
        List<Tesla> data = exchangeTwoOrderBookService.getTeslaData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Tesla
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getTeslaRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getTeslaRepository().saveAll(data);
    }

    public void getMicrosoftTrades() {
        List<Microsoft> data = exchangeTwoOrderBookService.getMicrosoftData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Microsoft
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getMicrosoftRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getMicrosoftRepository().saveAll(data);
    }

    public void getIBMTrades() {
        List<IBM> data = exchangeTwoOrderBookService.getIBMData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> IBM
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getIbmRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getIbmRepository().saveAll(data);
    }

    public void getOracleTrades() {
        List<Oracle> data = exchangeTwoOrderBookService.getOracleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Oracle
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getOracleRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getOracleRepository().saveAll(data);
    }

    public void getNetflixTrades() {
        List<Netflix> data = exchangeTwoOrderBookService.getNetflixData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulativeQuantity())
                .map(order -> Netflix
                        .builder()
                        .product(order.product())
                        .quantity(order.quantity())
                        .price(order.price())
                        .side(order.side())
                        .orderType(order.orderType())
                        .exchangeUrl("https//exchange2.matraining.com").build())
                .toList();
        orderRepositoryService.getNetflixRepository().deleteAllByExchangeUrl("https//exchange2.matraining.com");
        orderRepositoryService.getNetflixRepository().saveAll(data);
    }

    public void getMarketData() {
        List<MarketData>  marketData = exchangeTwoMarketDataService.getMarketData()
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
                        .exchangeUrl("https//exchange2.matraining.com")
                        .build()
                ).toList();
        marketDataRepository.deleteAllByExchangeUrl("https//exchange2.matraining.com");
        marketDataRepository.saveAll(marketData);
    }

}
