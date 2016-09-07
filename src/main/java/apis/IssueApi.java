package apis;

import utils.LoginUrl;

public class IssueApi extends RequestSender {

    RequestSender requestSender = new RequestSender();

    public void createNewCampaign(String body) {
        requestSender
                .createAuthorizationRequest(body)
                .post(LoginUrl.Campaign.getUri());
    }
}
