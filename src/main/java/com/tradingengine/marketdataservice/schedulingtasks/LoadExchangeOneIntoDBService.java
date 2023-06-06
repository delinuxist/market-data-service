package com.tradingengine.marketdataservice.schedulingtasks;


import com.tradingengine.marketdataservice.constants.ExchangeUrls;
import com.tradingengine.marketdataservice.models.*;
import com.tradingengine.marketdataservice.repositories.MarketDataRepository;
import com.tradingengine.marketdataservice.repositories.MicrosoftRepository;
import com.tradingengine.marketdataservice.services.ExchangeOneOrderBookService;
import com.tradingengine.marketdataservice.services.ExchangeTwoOrderBookService;
import com.tradingengine.marketdataservice.services.ProductRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Slf4j
public class LoadExchangeOneIntoDBService {
    @Autowired
    ExchangeOneOrderBookService exchangeOneOrderBookService;
    @Autowired
    ProductRepositoryService productRepositoryService;
    @Autowired
    MarketDataRepository marketDataRepository;


    @Scheduled(cron = "*/30 * * * * *")
    public void getMicrosoftTrades() {
        List<Microsoft> data = exchangeOneOrderBookService.getMicrosoftData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Microsoft(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getMicrosoftRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getMicrosoftRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Microsoft Orders Done!");
    }

        @Scheduled(cron = "*/30 * * * * *")
    public void getNetflixTrades() {
        List<Netflix> data = exchangeOneOrderBookService.getNetflixData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Netflix(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getNetflixRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getNetflixRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Netflix Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getAppleTrades() {
        List<Apple> data = exchangeOneOrderBookService.getAppleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order ->new Apple(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getAppleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getAppleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Apple Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getAmazonTrades() {
        List<Amazon> data = exchangeOneOrderBookService.getAmazonData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Amazon(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getAmazonRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getAmazonRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Amazon Orders Done!");
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void getGoogleTrades() {
        List<Google> data = exchangeOneOrderBookService.getGoogleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Google(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getGoogleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getGoogleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Google Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getTeslaTrades() {
        List<Tesla> data = exchangeOneOrderBookService.getTeslaData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Tesla(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getTeslaRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getTeslaRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Tesla Orders Done!");
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void getIBMTrades() {
        List<IBM> data = exchangeOneOrderBookService.getIBMData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new IBM(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getIbmRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getIbmRepository().saveAll(data);
        log.info("Cron job for ExchangeOne IBM Orders Done!");
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void getOracleTrades() {
        List<Oracle> data = exchangeOneOrderBookService.getOracleData()
                .parallelStream()
                .filter(order -> order.quantity() > order.cumulatitiveQuantity())
                .map(order -> new Oracle(
                        order.product(),
                        order.quantity(),
                        order.price(),
                        order.side(),
                        order.orderType(),
                        ExchangeUrls.ExchangeOneUrl.getUrl()))
                .toList();
        productRepositoryService.getOracleRepository().deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
        productRepositoryService.getOracleRepository().saveAll(data);
        log.info("Cron job for ExchangeOne Oracle Orders Done!");
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void getMarketData() {
          List<MarketData>  marketData = exchangeOneOrderBookService.getMarketData()
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
                            .exchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl())
                            .build()
                    ).toList();
          marketDataRepository.deleteAllByExchangeUrl(ExchangeUrls.ExchangeOneUrl.getUrl());
          marketDataRepository.saveAll(marketData);
        log.info("Cron job for ExchangeOne MarketData Orders Done!");
    }

}
