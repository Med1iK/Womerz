import apis.IssueApi;
import com.jayway.restassured.http.ContentType;
import fixtures.CampaignBody;
import fixtures.CampaignSocials;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


//@Test(groups = {"API", "LoginTest"})
public class LoginTest {
/*
    @Test(priority = 1)
    public void LoginByAdmin(){

        LoginBody loginBody = new LoginBody();
        String issue = loginBody.generateJSONBodyForLogin();
        System.out.println(issue);
    }
*/

    CampaignBody campaignBody = new CampaignBody();
    CampaignSocials campaignSocials = new CampaignSocials();

    @Test(priority = 1)
    public void createGoodStyleCampaign(){

        String campaign = campaignBody.generateJsonBodyForCampaign();

        IssueApi issueApi = new IssueApi();
        issueApi.createNewCampaign(campaign);

        assertEquals(issueApi.response.statusCode(), 200);
        assertTrue(issueApi.response.contentType().contains(ContentType.JSON.toString()));
    }

    @Test(priority = 2)
    public void createGoodStyleSocialForCampaign(){

        String socialBody = campaignSocials.generateSocialNetworkWithMoneyForCampaign();
        //String socialBody = campaignSocials.generateSocialNetworkWithGiftForCampaign();


        IssueApi issueApi2 = new IssueApi();
        issueApi2.createSocialForCampaign(socialBody);

        assertEquals(issueApi2.response.statusCode(), 200);
        assertTrue(issueApi2.response.contentType().contains(ContentType.JSON.toString()));
    }

    @Test(priority = 3)
    public void RemoveNewCampaign(){

        IssueApi issueApi3 = new IssueApi();
        issueApi3.deleteNewCampaign();

        assertEquals(issueApi3.response.statusCode(), 200);
        assertTrue(issueApi3.response.contentType().contains(ContentType.JSON.toString()));
    }

}
