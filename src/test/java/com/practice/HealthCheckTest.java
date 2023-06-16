package com.practice;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest {

    @Test
    public void healthCheckTest() {
        RequestSpecification given = given().log().all();
        given.get("https://restful-booker.herokuapp.com/ping").then()
                .assertThat()
                .statusCode(201);
    }
}
