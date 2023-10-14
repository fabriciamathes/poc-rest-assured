package health_controller;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.is;

public class HealthTest {
    @Test
    void getHealthCheck() {
        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .relaxedHTTPSValidation()
                .when()
                .get("https://practice.expandtesting.com/notes/api/health-check")
                .then()
                .statusCode(SC_OK)
                .body("message", is("Notes API is Running"));
    }
}
