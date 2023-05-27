package com.tradingengine.marketdataservice.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
@Slf4j
public class RestTemplateResponseHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws ResourceAccessException, IOException {
               if (clientHttpResponse.getStatusCode() != HttpStatus.OK) {
                   log.info("Status code: " + clientHttpResponse.getStatusCode());
                   log.info("Status code: " + clientHttpResponse.getStatusText());
                   log.info("Status code: " + clientHttpResponse.getBody());
                   return true;
               }
               return false;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws ResourceAccessException,IOException {
        if (clientHttpResponse.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR) {
            log.debug(HttpStatus.INTERNAL_SERVER_ERROR + " response. Couldn't',t access data from Exchange");
        }
    }
}
