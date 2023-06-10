package com.tradingengine.marketdataservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private Double BID_PRICE;
    private Integer SELL_LIMIT;
    private Double ASK_PRICE;
    private Integer BUY_LIMIT;
    private Double MAX_PRICE_SHIFT;
    private String TICKER;
    private Double LAST_TRADED_PRICE;
    private LocalDateTime timestamp;
}
