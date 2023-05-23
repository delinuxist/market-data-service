package com.tradingengine.marketdataservice.controller;

import com.tradingengine.marketdataservice.dtos.FullOrderBookDto;
import com.tradingengine.marketdataservice.dtos.OrderDto;
import com.tradingengine.marketdataservice.services.ExchangeOneFullOrderBookService;
import com.tradingengine.marketdataservice.services.ExchangeOneService.*;
import com.tradingengine.marketdataservice.services.ExchangeTwoFullOrderBookService;
import com.tradingengine.marketdataservice.services.ExchangeTwoService.*;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/market")
@RequiredArgsConstructor
public class MarketDataController {
    private final AmazonExchangeOneService amazonExchangeOneService;
    private final AppleExchangeOneService appleExchangeOneService;
    private final IBMExchangeOneService ibmExchangeOneService;
    private final GoogleExchangeOneService googleExchangeOneService;
    private final MicrosoftExchangeOneService microsoftExchangeOneService;
    private final NetflixExchangeOneService netflixExchangeOneService;
    private final OracleExchangeOneService oracleExchangeOneService;
    private final TeslaExchangeOneService teslaExchangeOneService;

    private final AppleExchangeTwoService appleExchangeTwoService;
    private final AmazonExchangeTwoService amazonExchangeTwoService;
    private final IBMExchangeTwoService ibmExchangeTwoService;
    private final GoogleExchangeTwoService googleExchangeTwoService;
    private final MicrosoftExchangeTwoService microsoftExchangeTwoService;
    private final OracleExchangeTwoService oracleExchangeTwoService;
    private final NetflixExchangeTwoService netflixExchangeTwoService;
    private final TeslaExchangeTwoService teslaExchangeTwoService;

    private final ExchangeTwoFullOrderBookService exchangeTwoFullOrderBookService;
    private final ExchangeOneFullOrderBookService exchangeOneFullOrderBookService;

    @GetMapping("/one")
    @ResponseStatus(HttpStatus.OK)
    public List<FullOrderBookDto> exchangeOneOpenTrades() {
        return exchangeOneFullOrderBookService.getOrderBooks();
    }

    @GetMapping("/two")
    @ResponseStatus(HttpStatus.OK)
    public List<FullOrderBookDto> exchangeTwoOpenTrades() {
        return exchangeTwoFullOrderBookService.getOrderBooks();
    }


    @GetMapping("/amzn/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> amazonExchangeOneOpenTrades() {
        return amazonExchangeOneService.getOrderBooks();
    }

    @GetMapping("/aapl/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> appleExchangeOneOpenTrades() {
        return appleExchangeOneService.getOrderBooks();
    }

    @GetMapping("/googl/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> googleExchangeOneOpenTrades() {
        return googleExchangeOneService.getOrderBooks();
    }

    @GetMapping("/ibm/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> ibmExchangeOneOpenTrades() {
        return ibmExchangeOneService.getOrderBooks();
    }

    @GetMapping("/msft/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> microsoftExchangeOneOpenTrades() {
        return microsoftExchangeOneService.getOrderBooks();
    }

    @GetMapping("/nflx/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> netflixExchangeOpenTrades() {
        return netflixExchangeOneService.getOrderBooks();
    }

    @GetMapping("/orcl/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> oracleExchangeOneOpenTrades() {
        return oracleExchangeOneService.getOrderBooks();
    }

    @GetMapping("/tsla/one/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> teslaExchangeOneOpenTrades() {
        return teslaExchangeOneService.getOrderBooks();
    }


    @GetMapping("/amzn/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> amazonExchangeTwoOpenTrades() {
        return amazonExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/aapl/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> appleExchangeTwoOpenTrades() {
        return appleExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/googl/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> googleExchangeTwoOpenTrades() {
        return googleExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/ibm/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> ibmExchangeTwoOpenTrades() {
        return ibmExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/msft/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> microsoftExchangeTwoOpenTrades() {
        return microsoftExchangeTwoService.getOrderBooks();
    }


    @GetMapping("/orcl/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> oracleExchangeTwoOpenTrades() {
        return oracleExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/nflx/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> netflixExchangeTwoOpenTrades() {
        return netflixExchangeTwoService.getOrderBooks();
    }

    @GetMapping("/tsla/two/open")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> teslaExchangeTwoOpenTrades() {
        return teslaExchangeTwoService.getOrderBooks();
    }

}
