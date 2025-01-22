import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredChallengeTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void getPosts() {

        given()
        .when()
        .get("/posts/1")
        .then()
        .statusCode(200)
        .body("title", notNullValue())
        .body("userId", greaterThan(0));

    }

    @Test
    public void getUsers() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        var response = RestAssured
                .given()
                .when()
                .get("/users/1");

        response.then()
                .statusCode(200)
                .body("email", matchesPattern(emailRegex))
                .body("address.city", notNullValue());
    }
}
