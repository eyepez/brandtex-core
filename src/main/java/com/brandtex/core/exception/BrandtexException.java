package com.brandtex.core.exception;

public class BrandtexException extends Exception{

    private static final long serialVersionUID = 1L;

    public BrandtexException() {
    }

    public BrandtexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BrandtexException(String message, Throwable cause) {
        super(message, cause);
    }

    public BrandtexException(String message) {
        super(message);
    }

    public BrandtexException(Throwable cause) {
        super(cause);
    }
}
