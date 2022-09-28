package basiccrudrestassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.notNullValue;


public class Put {

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
}
