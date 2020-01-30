package com.uj.study.rest.etag.resources.web.hateoas.event;

import org.springframework.context.ApplicationEvent;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ：unclejet
 * @date ：Created in 2020/1/29 22:01
 * @description：
 * @modified By：
 * @version:
 */
public class SingleResourceRetrievedEvent extends ApplicationEvent {
    private final HttpServletResponse response;

    public SingleResourceRetrievedEvent(final Object source, final HttpServletResponse response) {
        super(source);

        this.response = response;
    }

    // API

    public HttpServletResponse getResponse() {
        return response;
    }

}
