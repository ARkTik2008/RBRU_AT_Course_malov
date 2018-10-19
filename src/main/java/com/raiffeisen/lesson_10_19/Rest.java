package com.raiffeisen.lesson_10_19;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;


public class Rest {

    public static void main(String[] args) {
       Response rs = get("https://www.cbr.ru/scripts/XML_daily.asp");
    }

}
