package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import fixtures.LoginBody;
import utils.LoginUrl;

import static com.jayway.restassured.RestAssured.given;


public class RequestSender {

    public static String JSESSIONID = null;
    public final static ContentType CONTENT_TYPE = ContentType.JSON;
    public static RequestSpecification requestSpecification = null;
    public static Response response = null;


    public RequestSender(){ authorization(); }


    public void authorization() {
        RestAssured.baseURI = "http://apiwomerz.wbd.co.il";

        LoginBody loginBody = new LoginBody();
        String credentials = loginBody.generateJSONBodyForLogin();

        createRequest(credentials)
                .post(LoginUrl.LOGIN.getUri());

         this.JSESSIONID = response.then().statusCode(200).extract().path("token"); //session.value
        System.out.println(this.JSESSIONID);
    }

    public RequestSender createRequest (String body){
         this.createRequestSpecification()
                .addHeader("Content Type", CONTENT_TYPE.toString())
               //  .addHeader("token=", "bearer " + RequestSender.JSESSIONID)
                // .addHeader("Authorization", "Bearer "+ RequestSender.JSESSIONID)
                .addBody(body);
        return this;
    }
    public RequestSender createAuthorizationRequest(String body){
        this.createRequestSpecification()
                .addHeader("Content Type", CONTENT_TYPE.toString())
              //  .addHeader("Cookie", "token= bearer " + RequestSender.JSESSIONID)
                .addHeader("Authorization", "Bearer "+ RequestSender.JSESSIONID)
                .addBody(body);
        return this;
    }

    public RequestSender createRequestSpecification() {
        requestSpecification = given()
                .when();
        return this;
    }


    public RequestSender addHeader(String headerName, String headerValue) {
        requestSpecification.header(headerName, headerValue);
        return this;
    }

    public RequestSender addBody(String body) {
        requestSpecification.body(body);
        return this;
    }

    public RequestSender post(String uri) {
        response = requestSpecification.post(uri);
        return this;
    }

    public RequestSender patch(String uri) {
        response = requestSpecification.patch(uri);
        return this;
    }

    public RequestSender delete(String uri) {
        response = requestSpecification.delete(uri);
        return this;
    }

    public RequestSender get(String uri) {
        response = requestSpecification.get(uri);
        return this;
    }


    public static String extractResponseByPath(String path){

        return response.then().extract().path(path);
    }

}
