package com.virgingames.testsuite;

import com.virgingames.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VirginGamesGetTest extends TestBase {


//    public void test01_GetBooking() {
//        Response response = given()
//                .when()
//                .get("/currency", "GBP");
//                response.then().log().all().statusCode(200);
//    }
    @Test
        public void getTestForGBP() {
    Response response = given()
            .when()
        .get("https://www.virgingames.com/api/jackpots/bingo");
    response.then().statusCode(200);
    response.prettyPrint();
}


    @Test
    public void getTestForEuro() {
        Response response = given()
                .when()
                .get("https://www.virgingames.com/api/jackpots/bingo?currency=EUR");
        response.then().statusCode(200);
        response.prettyPrint();
       // assertEquals(response.statusCode(),200,"Unexpected Code");
    }

    @Test
    public void getTestForSEK() {
        Response response = given()
                .when()
                .get("https://www.virgingames.com/api/jackpots/bingo?currency=SEK");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}