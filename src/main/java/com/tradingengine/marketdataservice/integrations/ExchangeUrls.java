package com.tradingengine.marketdataservice.integrations;

public enum ExchangeUrls {

    ExchangeOneUrl("https://exchange.matraining.com/"),
    ExchangeTwoUrl("https://exchange2.matraining.com/"),
    ExchangeOneProductsUrl("https://exchange.matraining.com/pd"),
    ExchangeTwoProductsUrl("https://exchange2.matraining.com/pd"),
    MicrosoftExchangeOne("https://exchange.matraining.com/orderbook/MSFT/open"),
    AmazonExchangeOne("https://exchange.matraining.com/orderbook/AAPL/open"),
    TeslaExchangeOne("https://exchange.matraining.com/orderbook/MSFT/open"),
    GoogleExchangeOne("https://exchange.matraining.com/orderbook/GOOGL/open"),
    IBMExchangeOne("https://exchange.matraining.com/orderbook/IBM/open"),
    OracleExchangeOne("https://exchange.matraining.com/orderbook/ORCL/open"),
    AppleExchangeOne("https://exchange.matraining.com/orderbook/AMZN/open"),
    NetflixExchangeOne("https://exchange.matraining.com/orderbook/NFLX/open"),
    MicrosoftExchangeTwo("https://exchange2.matraining.com/orderbook/MSFT/open"),
    AmazonExchangeTwo("https://exchange2.matraining.com/orderbook/AAPL/open"),
    TeslaExchangeTwo("https://exchange2.matraining.com/orderbook/MSFT/open"),
    GoogleExchangeTwo("https://exchange2.matraining.com/orderbook/GOOGL/open"),
    IBMExchangeTwo("https://exchange2.matraining.com/orderbook/IBM/open"),
    OracleExchangeTwo("https://exchange2.matraining.com/orderbook/ORCL/open"),
    AppleExchangeTwo("https://exchange2.matraining.com/orderbook/AMZN/open"),
    NetflixExchangeTwo("https://exchange2.matraining.com/orderbook/NFLX/open");

    private String url;

    ExchangeUrls(String constant) {
        this.url = constant;
    }

   public String getUrl() {
        return url;
    }
}
