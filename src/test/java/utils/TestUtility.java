package utils;

import io.restassured.response.Response;
import org.testng.Assert;

public class TestUtility {

    public static void verifyStatusCode(Response response, int expectedStatusCode){
        int actualStatusCode = response.getStatusCode();
        System.out.println("Status Code:  " + actualStatusCode);
        Assert.assertEquals(actualStatusCode, expectedStatusCode,
                 "Expected status code " + expectedStatusCode + "but got " + actualStatusCode);
    }

    public static void verifyResponseTime(Response response,  long maxTime){
        long responseTime = response.getTime();
        Assert.assertTrue(responseTime < maxTime,  "Response time " + responseTime + "ms maxtime " + maxTime);

    }
}
