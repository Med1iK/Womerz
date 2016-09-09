package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import fixtures.JiraJSONFixture;
import utils.LoginUrl;

import static com.jayway.restassured.RestAssured.given;


public class RequestSender {

    public static String JSESSIONID = null;
    public final static ContentType CONTENT_TYPE = ContentType.JSON;
    public static RequestSpecification requestSpecification = null;
    public static Response response = null;


    public RequestSender(){
        authenticate();
    }

    public void authenticate() {
        RestAssured.baseURI = "http://apiwomerz.wbd.co.il";

        JiraJSONFixture jiraJSONFixture = new JiraJSONFixture();
        String credentials = jiraJSONFixture.generateJSONForLogin();

        System.out.println("Do we have body?" + credentials);
        createRequest(credentials)
                .post(LoginUrl.LOGIN.getUri());


        this.JSESSIONID = response.then().statusCode(200).extract().path("token");
        System.out.println(JSESSIONID);
    }

    public RequestSender createRequest(String body){
        this.createRequestSpecification()
                .addHeader("Content-Type", CONTENT_TYPE.toString())
                //.addHeader("Authorization", "Bearer " + RequestSender.JSESSIONID)
                .addBody(body);
        return this;
    }
    public RequestSender createRequestS(String body){
        this.createRequestSpecification()
                .addHeader("Content-Type", IssueApi.CONTENT_TYPE.toString())
                .addHeader("Authorization", "Bearer " + RequestSender.JSESSIONID)
                .addBody(body);
        return this;
    }

    public RequestSender createRequestSpecification() {
        requestSpecification = given().
                when();
        return this;
    }

    // этот метод сможет добавлять столько угодно хедеров
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

    public RequestSender get(String uri) {
        response = requestSpecification.get(uri);
        return this;
    }

}
