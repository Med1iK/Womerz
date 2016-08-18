package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;


public class LoginSender {

    public static String JSESSIONID = null;
    public final static ContentType CONTENT_TYPE = ContentType.JSON;
    public static RequestSpecification requestSpecification = null;
    public static Response response = null;


    public LoginSender(){
        authorization();
    }
    public Response authorization() {
        RestAssured.baseURI = "http://apiwomerz.wbd.co.il";

        LoginBody loginBody = new LoginBody();
        String credentials = loginBody.generateJSONBodyForLogin();

        createRequest(credentials)
                .post(LoginUrl.LOGIN.getUri());

        this.JSESSIONID = response.then().extract().path("session.value");

        System.out.println("Response:" + response.asString());
        return response;
    }

    public LoginSender createRequest (String body){
        this.createRequestSpecification()
                .addHeader("Content Type", CONTENT_TYPE.toString())
                .addBody(body);
        return this;
    }

    public LoginSender createRequestSpecification() {
        requestSpecification = requestSpecification.given().
                when();
        return this;
    }


    public LoginSender addHeader(String headerName, String headerValue) {
        requestSpecification.header(headerName, headerValue);
        return this;
    }

    public LoginSender addBody(String body) {
        requestSpecification.body(body);
        return this;
    }

    public LoginSender post(String uri) {
        response = requestSpecification.post(uri);
        return this;
    }

    public LoginSender patch(String uri) {
        response = requestSpecification.patch(uri);
        return this;
    }

    public LoginSender delete(String uri) {
        response = requestSpecification.delete(uri);
        return this;
    }

    public LoginSender get(String uri) {
        response = requestSpecification.get(uri);
        return this;
    }


    public String extractResponseByPath(String path){
        return response.then().extract().path(path);
    }

}
