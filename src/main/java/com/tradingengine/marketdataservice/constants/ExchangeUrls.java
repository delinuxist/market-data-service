package com.tradingengine.marketdataservice.constants;

public enum ExchangeUrls {

    ExchangeOneUrl("https://exchange.matraining.com/"),
    ExchangeTwoUrl("https://exchange2.matraining.com/"),
    ExchangeOneProductsUrl("https://exchange.matraining.com/pd"),
    ExchangeTwoProductsUrl("https://exchange2.matraining.com/pd");
    private String url;

    ExchangeUrls(String constant) {
        this.url = constant;
    }

   public String getUrl() {
        return url;
    }
}
