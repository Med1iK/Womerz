import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.post;


public class Training {

    private static String LoginEmail = "********";
    private static String LoginPassword = "*******";
    private static String JSSESSIONID = null;


    private static String categoryId = "59";
    private static String countryId = "2";
    private static String title = "I Hope, that it will be work";
    private static String url = "http://domain/some/url/";
    private static String videoUrl = "http://domain/some/url/";
    private static String base64 = "Base64 encode content";
    private static String filetype = "jpeg";
    private static String companyUrl = "http://domain/some/url/";
    private static String description = "Hello";
    private static String content = "Hi";
    private static String isHot = "true";
    private static String dateStart = "2016-04-29T10:01:59.709Z";
    private static String dateEnd = "2016-05-29T10:02:13.316Z";
    private static String limitActions = "1";
    private static String limitDailyActions = "1";
    private static String budget = "1";
    private static String budgetPerDay = "1";
    private static String currentAmount = "1";
    private static String rewardType = "money";
    private static String giftName = "null";
    private static String giftDescription = "null";
    private static String active = "true";
    private static String pause = "false";

    @Test(priority = 1)
    public void loginA() {
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
        Pattern MY_PATTERN = Pattern.compile("^\\{\\\"token\\\"\\:\\\"(.+)\\\"\\}");
        Matcher m = MY_PATTERN.matcher(response.asString());
        if (m.matches())
            JSSESSIONID = m.group(1);
        else
            System.out.println("No token match =(");

        System.out.println("Token = " + JSSESSIONID);



        JSSESSIONID = given().
                header("Content-Type", "application/json").
                body(application.toJSONString()).
                when().
                post("/auth/local").
                then().
                statusCode(200).
                extract().
                path("token");
        System.out.println(JSSESSIONID);
    }

    @Test(priority = 2)
    public void createNewCampaign(){
        RestAssured.baseURI = "http://apiwomerz.wbd.co.il";

        JSONObject imageUrl = new JSONObject();
        imageUrl.put("base64", base64);
        imageUrl.put("filetype", filetype);

        JSONObject campaign = new JSONObject();
        campaign.put("categoryId", categoryId);
        campaign.put("countryId", countryId);
        campaign.put("title", title);
        campaign.put("url", url);
        campaign.put("videoUrl", videoUrl);
        campaign.put("imageUrl", imageUrl);
        campaign.put("companyUrl", companyUrl);
        campaign.put("description", description);
        campaign.put("content", content);
        campaign.put("isHot", isHot);
        campaign.put("dateStart", dateStart);
        campaign.put("dateEnd", dateEnd);
        campaign.put("limitActions", limitActions);
        campaign.put("limitDailyActions", limitDailyActions);
        campaign.put("budget", budget);
        campaign.put("budgetPerDay", budgetPerDay);
        campaign.put("currentAmount", currentAmount);
        campaign.put("rewardType", rewardType);
        campaign.put("giftName", giftName);
        campaign.put("giftDescription", giftDescription);
        campaign.put("active", active);
        campaign.put("pause", pause);

        System.out.println("Token2 = " + JSSESSIONID);
        Response response = given().
                header("Content-Type", "application/json").
                header("Authorization", "Bearer "+JSSESSIONID).
                body(campaign.toJSONString()).
                when().
                post("/api/campaigns").
                then().
                statusCode(200).
                extract().response();
        System.out.println("Response:" + response.asString());
    }
}
