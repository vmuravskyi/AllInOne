package basiccrudrestassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Patch {

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
}
