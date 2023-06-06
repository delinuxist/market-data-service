package com.tradingengine.marketdataservice.schedulingtasks;

import com.tradingengine.marketdataservice.constants.ExchangeUrls;
import com.tradingengine.marketdataservice.models.*;;
import com.tradingengine.marketdataservice.repositories.MarketDataRepository;
import com.tradingengine.marketdataservice.services.ExchangeTwoOrderBookService;
import com.tradingengine.marketdataservice.services.ProductRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



import java.util.List;

@Component
@Slf4j
public class LoadExchangeTwoIntoDBService {
    @Autowired
    ExchangeTwoOrderBookService exchangeTwoOrderBookService;
    @Autowired
    ProductRepositoryService productRepositoryService;
    @Autowired
    MarketDataRepository marketDataRepository;
    @Scheduled(cron = "*/30 * * * * *")
    public void getMicrosoftTrades() {
        List<Microsoft> data = exchangeTwoOrderBookService.getMicrosoftData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Microsoft(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getMicrosoftRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getMicrosoftRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Microsoft Orders Done!");
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void getNetflixTrades() {
        List<Netflix> data = exchangeTwoOrderBookService.getNetflixData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Netflix(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getNetflixRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getNetflixRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Netflix Orders Done!");
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void getAppleTrades() {
        List<Apple> data = exchangeTwoOrderBookService.getAppleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Apple(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getAppleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getAppleRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Apple Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getAmazonTrades() {
        List<Amazon> data = exchangeTwoOrderBookService.getAmazonData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Amazon(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();;
        productRepositoryService.getAmazonRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getAmazonRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Amazon Orders Done!");
    }
//
//
    @Scheduled(cron = "*/30 * * * * *")
    public void getGoogleTrades() {
        List<Google> data = exchangeTwoOrderBookService.getGoogleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order ->new Google(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getGoogleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getGoogleRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Google Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getTeslaTrades() {
        List<Tesla> data = exchangeTwoOrderBookService.getTeslaData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Tesla(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getTeslaRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getTeslaRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Tesla Orders Done!");
    }



    @Scheduled(cron = "*/30 * * * * *")
    public void getIBMTrades() {
        List<IBM> data = exchangeTwoOrderBookService.getIBMData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new IBM(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getIbmRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getIbmRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo IBM Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getOracleTrades() {
        List<Oracle> data = exchangeTwoOrderBookService.getOracleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Oracle(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeTwoUrl.getUrl()))
                .toList();
        productRepositoryService.getOracleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        productRepositoryService.getOracleRepository().saveAll(data);
        log.info("Cron job for ExchangeTwo Oracle Orders Done!");
    }





    @Scheduled(cron = "*/30 * * * * *")
    public void getMarketData() {
        List<MarketData>  marketData = exchangeTwoOrderBookService.getMarketData()
                .parallelStream()
                .map(data -> MarketData
                        .builder()
                        .ticker(data.TICKER())
                        .sellLimit(data.SELL_LIMIT())
                        .lastTradedPrice(data.LAST_TRADED_PRICE())
                        .maxPriceShift(data.MAX_PRICE_SHIFT())
                        .askPrice(data.ASK_PRICE())
                        .bidPrice(data.BID_PRICE())
                        .buyLimit(data.BUY_LIMIT())
                        .exchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl())
                        .build()
                ).toList();
        marketDataRepository.deleteAllByExchangeUrl(ExchangeUrls.ExchangeTwoUrl.getUrl());
        marketDataRepository.saveAll(marketData);
        log.info("Cron job for ExchangeTwo MarketData Orders Done!");
    }

}
