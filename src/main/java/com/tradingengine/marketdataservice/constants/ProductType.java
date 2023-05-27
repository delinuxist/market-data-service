package com.tradingengine.marketdataservice.constants;

public enum ProductType {
    AMAZON(
            "https://exchange.matraining.com/orderbook/AMZN/open",
            "https://exchange2.matraining.com/orderbook/AMZN/open"),
    APPLE(
            "https://exchange.matraining.com/orderbook/AAPL/open",
            "https://exchange2.matraining.com/orderbook/AAPL/open"),
    GOOGLE(
            "https://exchange.matraining.com/orderbook/GOOGL/open",
            "https://exchange2.matraining.com/orderbook/GOOGL/open"),
    TESLA(
            "https://exchange.matraining.com/orderbook/TSLA/open",
            "https://exchange2.matraining.com/orderbook/TSLA/open"),
    IBM(
            "https://exchange.matraining.com/orderbook/IBM/open",
            "https://exchange2.matraining.com/orderbook/IBM/open"),
    ORACLE(
            "https://exchange.matraining.com/orderbook/ORCL/open",
            "https://exchange2.matraining.com/orderbook/ORCL/open"),
    NETFLIX(
            "https://exchange.matraining.com/orderbook/ORCL/open",
            "https://exchange2.matraining.com/orderbook/ORCL/open"),
    MICROSOFT(
            "https://exchange.matraining.com/orderbook/ORCL/open",
            "https://exchange2.matraining.com/orderbook/ORCL/open");

    private final String exchangeOneUrl;

    private final String exchangeTwoUrl;

    ProductType(String exchangeOneUrl, String exchangeTwoUrl) {
        this.exchangeOneUrl = exchangeOneUrl;
        this.exchangeTwoUrl = exchangeTwoUrl;
    }

    public String getExchangeOneUrl() {
        return exchangeOneUrl;
    }

    public String getExchangeTwoUrl() {
        return exchangeTwoUrl;
    }
}
