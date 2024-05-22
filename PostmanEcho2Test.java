import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanEcho2Test {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testPostMethod() {
        Map<String, String> man = new HashMap<>();
        man.put("firstname", "Ilya");
        man.put("lastname", "Chuchin");
        man.put("city", "Moscow");

        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .params(man)
                .when().post("/post")
                .then().log().all()
                .statusCode(200)
                .body("form.firstname", equalTo("Ilya"))
                .body("form.lastname", equalTo("Chuchin"))
                .body("json.firstname", equalTo("Ilya"))
                .body("json.lastname", equalTo("Chuchin"))
                .body("headers.x-forwarded-port", equalTo("443"));
    }

    @Test
    public void testGetMethod() {
        given()
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"));
    }

    @Test
    public void testPutMethod() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/put"));
    }

   @Test
   public void testPatchMethod() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void testDeleteMethod() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200);

    }
}
