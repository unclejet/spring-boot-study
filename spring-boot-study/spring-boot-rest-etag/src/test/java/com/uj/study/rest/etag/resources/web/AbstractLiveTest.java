package com.uj.study.rest.etag.resources.web;

import com.google.common.base.Preconditions;
import com.google.common.net.HttpHeaders;
import com.uj.study.rest.etag.test.IMarshaller;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

import static com.uj.study.rest.etag.resources.web.Consts.APPLICATION_PORT;

/**
 * @author ：unclejet
 * @date ：Created in 2020/1/29 22:13
 * @description：
 * @modified By：
 * @version:
 */
public abstract class AbstractLiveTest<T extends Serializable> {

    protected final Class<T> clazz;

    @Autowired
    protected IMarshaller marshaller;

    public AbstractLiveTest(final Class<T> clazzToSet) {
        super();

        Preconditions.checkNotNull(clazzToSet);
        clazz = clazzToSet;
    }

    // template method

    public abstract void create();

    public abstract String createAsUri();

    protected final void create(final T resource) {
        createAsUri(resource);
    }

    protected final String createAsUri(final T resource) {
        final Response response = createAsResponse(resource);
        Preconditions.checkState(response.getStatusCode() == 201, "create operation: " + response.getStatusCode());

        final String locationOfCreatedResource = response.getHeader(HttpHeaders.LOCATION);
        Preconditions.checkNotNull(locationOfCreatedResource);
        return locationOfCreatedResource;
    }

    final Response createAsResponse(final T resource) {
        Preconditions.checkNotNull(resource);

        final String resourceAsString = marshaller.encode(resource);
        return RestAssured.given()
                .contentType(marshaller.getMime())
                .body(resourceAsString)
                .post(getURL());
    }

    //

    protected String getURL() {
        return "http://localhost:" + APPLICATION_PORT + "/spring-boot-rest/foos";
    }

}