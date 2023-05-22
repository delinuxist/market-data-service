package com.tradingengine.marketdataservice.exceptions;

/**
 * An enumeration of error codes and associated i18n message keys for order
 * related validation errors.
 *
 **/
public enum ErrorCode {
    // Internal Errors: 1 to 0999
    GENERIC_ERROR("500", "The system is unable to complete the request. Contact system support.");

    private String errCode;
    private String errMsgKey;

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    /**
     * @return the errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * @return the errMsgKey
     */
    public String getErrMsgKey() {
        return errMsgKey;
    }
}