package com.uj.study.custom.media.type;

import io.restassured.http.ContentType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;

/**
 * @author ：unclejet
 * @date ：Created in 2020/2/26 6:08
 * @description：
 * @modified By：
 * @version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CustomMediaTypeControllerLiveTest {
    private static final String URL_PREFIX = "http://localhost:8082/spring-rest";

    @Test
    public void givenServiceEndpoint_whenGetRequestFirstAPIVersion_thenShouldReturn200() {
        given()
                .accept("application/vnd.baeldung.api.v1+json")
                .when()
                .get(URL_PREFIX + "/public/api/items/1")
                .then()
                .contentType(ContentType.JSON).and().statusCode(200);
    }

    @Test
    public void givenServiceEndpoint_whenGetRequestSecondAPIVersion_thenShouldReturn200() {
        given()
                .accept("application/vnd.baeldung.api.v2+json")
                .when()
                .get(URL_PREFIX + "/public/api/items/2")
                .then()
                .contentType(ContentType.JSON).and().statusCode(200);
    }
}
