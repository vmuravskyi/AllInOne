package basicCRUDrestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class CrudTest {

    @Test
    public void testPost() throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Volodymyr");
        map.put("job", "Test Automation Engineer Trainee");
        String json = new ObjectMapper().writeValueAsString(map);

        RestAssured.given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(json)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .log().body();
    }

    @Test
    public void testGet() {
        RestAssured.given().get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .and()
                .body("data.id[1]", equalTo(8))
                .body("data.first_name", hasItems("Byron", "George"));
    }

    @Test
    public void testPut() throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Volodymyr");
        map.put("job", "Test Automation Engineer Senior");
        String json = new ObjectMapper().writeValueAsString(map);

        RestAssured.given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(json)
                .when()
                .put("https://reqres.in/api/users")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testPatch() throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Vova");
        map.put("job", "Test Automation Engineer Senior");
        String json = new ObjectMapper().writeValueAsString(map);

        RestAssured.given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(json)
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testDelete() throws JsonProcessingException {

        RestAssured.when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .log().body();
    }
}
