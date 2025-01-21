package backend;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.matcher.RestAssuredMatchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigManager;

import static com.jayway.restassured.RestAssured.given;


public class API_jayway {
ConfigManager configManager = new ConfigManager();



    @BeforeTest
    public void setup()
    {
        RestAssured.baseURI=configManager.get("baseURI");
        //         RestAssured.useRelaxedHTTPSValidation();// what does it mean
    }
    @Test
    public void Testjayway() {
        given().get("/users/2").then()
                .statusCode(200).log().all();
//.assertThat().body(RestAssuredMatchers.("jsonSchemas/schema_reqres_getlist_response.json"))

    }

}
