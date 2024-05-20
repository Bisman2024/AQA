import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static groovy.util.ObservableSet.ChangeType.newValue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetMethod() {
        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args", equalTo(new HashMap<>()));
    }

    @Test
    public void testDeleteMethod() {
        given()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("args", equalTo(new HashMap<>()));
    }
}
