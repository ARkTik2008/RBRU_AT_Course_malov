package com.raiffeisen.lesson_10_19;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class Rest {

    public static void main(String[] args) {
       Response rs = get("https://www.cbr.ru/scripts/XML_daily.asp");
        rs.getBody().xmlPath().get("\\valute[@IID = 'R01010']");
        given().body("").when().get("").then();
    }
}
