package fixtures;

import org.json.simple.JSONObject;

public class CampaignBody {

    private static String categoryId = "59";
    private static String countryId = "1";
    private static String title = "I Hope, that it will be work";
    private static String url = "http://domain/some/url/";
    private static String videoUrl = "http://domain/some/url/";
    private static String base64 = "Base64 encode content";
    private static String filetype = "jpeg";
    private static String companyUrl = "http://domain/some/url/";
    private static String description = "Hello";
    private static String content = "Hi";
    private static String isHot = "true";
    private static String dateStart = "2016-08-29T10:01:59.709Z";
    private static String dateEnd = "2016-09-29T10:02:13.316Z";
    private static String limitActions = "11";
    private static String limitDailyActions = "11";
    private static String budget = "11";
    private static String budgetPerDay = "11";
    private static String currentAmount = "11";
    private static String rewardType = "money";
    private static String giftName = "null";
    private static String giftDescription = "null";
    private static String active = "true";
    private static String pause = "false";


    public String generateJsonBodyForCampaign() {


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

        return campaign.toJSONString();
    }
}
