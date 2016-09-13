package fixtures;

import apis.IssueApi;
import org.json.simple.JSONObject;

public class CampaignSocials {

    IssueApi issueApi = new IssueApi();
    int IdFromCampaign = issueApi.CampaignId;

    private int campaignId = IdFromCampaign;
    private static String provider = "facebook";
    private static String rewardTypeMoney = "money";
    private static String rewardTypeGift = "gift";
    private static String giftName = "StarShip";
    private static String giftDescription = "HeheHahaYeeep";
    private static int TotalLike = 5;
    private static int TotalShare = 5;
    private static int TotalComment = 5;
    private static int Dailylike = 5;
    private static int Dailyshare = 5;
    private static int Dailycomment = 5;
    private static int budget = 300;
    private static int budgetPerDay = 150;
    private static String paused = "false";
    private static String active = "true";
    private static int spots = 50;
    private static int likeCost= 25;
    private static int shareCost= 25;
    private static int commentCost= 25;


    public String generateSocialNetworkWithMoneyForCampaign(){

        JSONObject totalActions = new JSONObject();
        totalActions.put("like", TotalLike);
        totalActions.put("share", TotalShare);
        totalActions.put("comment", TotalComment);

        JSONObject dailyActions = new JSONObject();
        dailyActions.put("like", Dailylike);
        dailyActions.put("share", Dailyshare);
        dailyActions.put("comment", Dailycomment);

        JSONObject actionsCost = new JSONObject();
        actionsCost.put("like", likeCost);
        actionsCost.put("share", shareCost);
        actionsCost.put("comment", commentCost);

        JSONObject socialNetwork = new JSONObject();
        socialNetwork.put("campaignId", campaignId);
        socialNetwork.put("provider", provider);
        socialNetwork.put("rewardType", rewardTypeMoney);
        socialNetwork.put("limitActions", totalActions);
        socialNetwork.put("limitDailyActions", dailyActions);
        socialNetwork.put("budget", budget);
        socialNetwork.put("budgetPerDay", budgetPerDay);
        socialNetwork.put("paused", paused);
        socialNetwork.put("active", active);
        socialNetwork.put("spots", spots);
        socialNetwork.put("costs", actionsCost);

        return socialNetwork.toJSONString();
    }

    public String generateSocialNetworkWithGiftForCampaign(){

        JSONObject totalActions = new JSONObject();
        totalActions.put("like", TotalLike);
        totalActions.put("share", TotalShare);
        totalActions.put("comment", TotalComment);

        JSONObject dailyActions = new JSONObject();
        dailyActions.put("like", Dailylike);
        dailyActions.put("share", Dailyshare);
        dailyActions.put("comment", Dailycomment);

        JSONObject actionsCost = new JSONObject();
        actionsCost.put("like", likeCost);
        actionsCost.put("share", shareCost);
        actionsCost.put("comment", commentCost);

        JSONObject socialNetwork = new JSONObject();
        socialNetwork.put("campaignId", campaignId);
        socialNetwork.put("provider", provider);
        socialNetwork.put("rewardType", rewardTypeGift);
        socialNetwork.put("giftName", giftName);
        socialNetwork.put("giftDescription", giftDescription);
        socialNetwork.put("limitActions", totalActions);
        socialNetwork.put("limitDailyActions", dailyActions);
        socialNetwork.put("budget", budget);
        socialNetwork.put("budgetPerDay", budgetPerDay);
        socialNetwork.put("paused", paused);
        socialNetwork.put("active", active);
        socialNetwork.put("spots", spots);
        socialNetwork.put("costs", actionsCost);

        return socialNetwork.toJSONString();
    }

}
