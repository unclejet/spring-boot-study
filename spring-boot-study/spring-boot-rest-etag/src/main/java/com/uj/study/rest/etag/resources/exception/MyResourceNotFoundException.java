package com.uj.study.rest.etag.resources.exception;

/**
 * @author ：unclejet
 * @date ：Created in 2020/1/29 21:57
 * @description：
 * @modified By：
 * @version:
 */
public final class MyResourceNotFoundException extends RuntimeException {

    public MyResourceNotFoundException() {
        super();
    }

    public MyResourceNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MyResourceNotFoundException(final String message) {
        super(message);
    }

    public MyResourceNotFoundException(final Throwable cause) {
        super(cause);
    }

}
