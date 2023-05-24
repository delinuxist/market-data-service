package com.tradingengine.marketdataservice.services;


import com.tradingengine.marketdataservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderRepositoryService {
    @Autowired
    private AppleRepository appleRepository;

    @Autowired
    private AmazonRepository amazonRepository;

    @Autowired
    private GoogleRepository googleRepository;

    @Autowired
    private TeslaRepository teslaRepository;

    @Autowired
    private MicrosoftRepository microsoftRepository;

    @Autowired
    private IBMRepository ibmRepository;

    @Autowired
    private OracleRepository oracleRepository;

    @Autowired
    private NetflixRepository netflixRepository;

    public AppleRepository getAppleRepository() {
        return appleRepository;
    }

    public AmazonRepository getAmazonRepository() {
        return amazonRepository;
    }

    public GoogleRepository getGoogleRepository() {
        return googleRepository;
    }

    public TeslaRepository getTeslaRepository() {
        return teslaRepository;
    }

    public MicrosoftRepository getMicrosoftRepository() {
        return microsoftRepository;
    }

    public IBMRepository getIbmRepository() {
        return ibmRepository;
    }

    public OracleRepository getOracleRepository() {
        return oracleRepository;
    }

    public NetflixRepository getNetflixRepository() {
        return netflixRepository;
    }
}
