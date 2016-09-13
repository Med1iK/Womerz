package apis;

import utils.LoginUrl;

public class IssueApi extends RequestSender {

    RequestSender requestSender = new RequestSender();
    public static int CampaignId ;


    public int createNewCampaign(String body) {
        requestSender
                .createRequestS(body)
                .post(LoginUrl.Campaign.getUri());
        this.CampaignId = response.then().extract().path("id");
        System.out.println("Tell me plz my CampaignId " + CampaignId);
        return CampaignId;
    }

    public void createSocialForCampaign(String body){
        requestSender
                .createRequestS(body)
                .post(LoginUrl.SocialNetwork.getUri() + IssueApi.CampaignId);
        System.out.println(CampaignId);
        System.out.println(LoginUrl.SocialNetwork.getUri() + IssueApi.CampaignId);
    }

    public void deleteNewCampaign(){
        requestSender
                .createRequestWithoutBody()
                .delete(LoginUrl.DeleteCampaign.getUri() + IssueApi.CampaignId);
        System.out.println("Tell me plz ID of campaign, which we want to delete, thanks=)" + LoginUrl.DeleteCampaign.getUri() + IssueApi.CampaignId);
    }
}
