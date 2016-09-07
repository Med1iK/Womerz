package apis;


import org.json.simple.JSONObject;

public class CampaignBody {

    private static String categoryId = "1";
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


    public String generateJsonBodyForCampaign() {


        JSONObject imageUrl = new JSONObject();
        imageUrl.put("base64", base64);
        imageUrl.put("filetype", filetype);

        JSONObject campaignB = new JSONObject();
        campaignB.put("categoryId", categoryId);
        campaignB.put("countryId", countryId);
        campaignB.put("title", title);
        campaignB.put("url", url);
        campaignB.put("videoUrl", videoUrl);
        campaignB.put("imageUrl", imageUrl);
        campaignB.put("companyUrl", companyUrl);
        campaignB.put("description", description);
        campaignB.put("content", content);
        campaignB.put("isHot", isHot);
        campaignB.put("dateStart", dateStart);
        campaignB.put("dateEnd", dateEnd);
        campaignB.put("limitActions", limitActions);
        campaignB.put("limitDailyActions", limitDailyActions);
        campaignB.put("budget", budget);
        campaignB.put("budgetPerDay", budgetPerDay);
        campaignB.put("currentAmount", currentAmount);
        campaignB.put("rewardType", rewardType);
        campaignB.put("giftName", giftName);
        campaignB.put("giftDescription", giftDescription);
        campaignB.put("active", active);
        campaignB.put("pause", pause);

        return campaignB.toJSONString();
    }
}
