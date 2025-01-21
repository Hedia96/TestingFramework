package backend;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigManager;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class API {
ConfigManager configManager = new ConfigManager();



    @BeforeClass
    public void setup()
    {

        RestAssured.baseURI= configManager.get("baseURI");
        //         RestAssured.useRelaxedHTTPSValidation();// what does it mean
    }
    @Test
    public void Test1() {
        given().get("/users/2").then()
                .statusCode(200).assertThat().body(matchesJsonSchemaInClasspath("jsonSchemas/schema_reqres_getlist_response.json")).log().all();


    }

}
