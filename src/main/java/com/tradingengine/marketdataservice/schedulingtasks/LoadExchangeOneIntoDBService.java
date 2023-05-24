package com.tradingengine.marketdataservice.schedulingtasks;

import com.tradingengine.marketdataservice.integrations.ExchangeUrls;
import com.tradingengine.marketdataservice.models.*;
import com.tradingengine.marketdataservice.repositories.MarketDataRepository;
import com.tradingengine.marketdataservice.services.ExchangeOneOrderBookService;
import com.tradingengine.marketdataservice.services.GetOrderRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
@EnableAsync
public class LoadExchangeOneIntoDBService {
    @Autowired
    ExchangeOneOrderBookService exchangeOneOrderBookService;
    @Autowired
    GetOrderRepositoryService getOrderRepositoryService;

    @Autowired
    MarketDataRepository marketDataRepository;



    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                 .toList();
        getOrderRepositoryService.getAppleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getAppleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Apple Orders Done!");
    }


    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getAmazonRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getAmazonRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Amazon Orders Done!");
    }

    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getGoogleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getGoogleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Google Orders Done!");
    }

    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getTeslaRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getTeslaRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Tesla Orders Done!");
    }

    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getMicrosoftRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getMicrosoftRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Tesla Orders Done!");
    }

    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getIbmRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getIbmRepository().saveAll(data);
        log.info("Cron job for ExchangeOne IBM Orders Done!");
    }

    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getOracleRepository().deleteAllByExchangeUrl("https//exchange.matraining.com");
        getOrderRepositoryService.getOracleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Oracle Orders Done!");
    }

    @Async
    @Scheduled(fixedRate =  20 ,timeUnit = TimeUnit.SECONDS)
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
                        .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl()).build())
                .toList();
        getOrderRepositoryService.getNetflixRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        getOrderRepositoryService.getNetflixRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Netflix Orders Done!");
    }
    @Async
    @Scheduled(fixedRate = 20 ,timeUnit = TimeUnit.SECONDS)
    public void getMarketData() {
          List<MarketData>  marketData = exchangeOneOrderBookService.getMarketData()
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
                            .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl())
                            .build()
                    ).toList();
          marketDataRepository.deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
          marketDataRepository.saveAll(marketData);
        log.info("Cron job for ExchangeOne MarketData Orders Done!");
    }


}
