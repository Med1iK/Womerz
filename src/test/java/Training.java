import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.apache.log4j.spi.LoggerFactory;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.responseSpecification;

public class Training {

    private static String LoginEmail = "PlzEnterloginEmail";
    private static String LoginPassword = "PlzEnterpassword";

    @Test
    public void loginA(){
        RestAssured.baseURI = "http://apiwomerz.wbd.co.il";

        JSONObject application = new JSONObject();
        application.put("email", LoginEmail);
        application.put("password", LoginPassword);

        Response response = given().
                header("Content-Type", "application/json").
                body(application.toJSONString()).
                when().
                post("/auth/local").
                then().
                statusCode(200).extract().response();
        System.out.println("Response:" + response.asString());
    }
}
