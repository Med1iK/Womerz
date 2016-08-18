package apis;


public class CampaignSendler extends LoginSender {

    LoginSender loginSender = new LoginSender();

    public void createCampaign(String body){
        loginSender
                .createRequest(body)
                .post("/api/campaigns");
    }


}
