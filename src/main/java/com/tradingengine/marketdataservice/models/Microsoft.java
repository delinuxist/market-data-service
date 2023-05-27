package com.tradingengine.marketdataservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName = "microsoft")
public class Microsoft extends Product{
    public Microsoft() {
        super();
    }

    public Microsoft(String product, int quantity, double price, String side, String orderType, String exchangeUrl) {
        super(product, quantity, price, side, orderType, exchangeUrl);
    }
}
