package test;

import config.TesConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.TestUtility;

public class JsonPlaceholder {
    @BeforeClass
    public void setup (){
        RestAssured.baseURI = TesConfig.JSONPLACEHOLDER_BASIC_URI;

    }

    // Get methods
    @Test
    public void getAllPosts(){
        Response response = RestAssured.given()
                .when()
                .get("/posts");
        TestUtility.verifyStatusCode(response, 200);
    }
    @Test
    public void getTimeResponse(){
        Response response = RestAssured.given()
                .when()
                .get("/posts");
        TestUtility.verifyResponseTime(response,1500);
    }

}
