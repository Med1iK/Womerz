import apis.CampaignBody;
import apis.CampaignSendler;
import apis.LoginBody;
import apis.LoginSender;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest {

    @Test
    public void LoginByAdmin(){

        LoginBody loginBody = new LoginBody();
        String issue = loginBody.generateJSONBodyForLogin();

    }


    @Test
    public void createGoodStyleCampaign(){

        CampaignBody campaignBody = new CampaignBody();
        String campaignB = campaignBody.generateJsonBodyForCampaign();

        CampaignSendler campaignSendler = new CampaignSendler();
        campaignSendler.createCampaign(campaignB);

    }
}
