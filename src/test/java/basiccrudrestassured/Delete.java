package basiccrudrestassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Delete {

    @Test
    public void testDelete() throws JsonProcessingException {

        RestAssured.when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .log().body();
    }
}
