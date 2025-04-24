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
                .get("/post");
        TestUtility.verifyStatusCode(response, 200);
        TestUtility.verifyResponseTime(response,4500);
    }

}
