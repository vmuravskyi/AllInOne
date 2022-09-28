package basiccrudrestassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Post {

    @Test
    public void testPost() throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Volodymyr");
        map.put("j ob", "Test Automation Engineer Trainee");
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
}
