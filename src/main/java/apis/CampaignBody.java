package apis;


import org.json.simple.JSONObject;

public class CampaignBody {

    private static String categoryId = "1";
    private static String countryId = "2";
    private static String title = "I Hope, that it will work";
    private static String campaignUrl = "http://domain/some/url/";
    private static String videoUrl = "http://domain/some/url/";
    private static String base64 = "img";
    private static String filetype = "jpeg";
    private static String companyUrl = "http://domain/some/url/";
    private static String description = "Hello";
    private static String content = "Hi";
    private static String isHot = "true";
    private static String dateStart = "2016-04-29T10:01:59.709Z";
    private static String dateEnd = "2016-05-29T10:02:13.316Z";
    private static String currentAmount = "currentAmount";
    private static String active = "true";
    private static String pause = "false";


    public String generateJsonBodyForCampaign() {

        JSONObject campaignB = new JSONObject();
        campaignB.put("categoryId", categoryId);
        campaignB.put("countryId", countryId);
        campaignB.put("title", title);
        campaignB.put("campaignUrl", campaignUrl);
        campaignB.put("videoUrl", videoUrl);
        campaignB.put("base64", base64);
        campaignB.put("filetype", filetype);
        campaignB.put("companyUrl", companyUrl);
        campaignB.put("description", description);
        campaignB.put("content", content);
        campaignB.put("isHot", isHot);
        campaignB.put("dateStart", dateStart);
        campaignB.put("dateEnd", dateEnd);
        campaignB.put("currentAmount", currentAmount);
        campaignB.put("active", active);
        campaignB.put("pause", pause);

        return campaignB.toJSONString();
    }
}
