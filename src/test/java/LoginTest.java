import apis.IssueApi;
import fixtures.CampaignSocials;
import fixtures.JiraJSONFixture;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import com.jayway.restassured.http.ContentType;


//@Test(groups = {"API", "LoginTest"})
public class LoginTest {

/*
    @Test(priority = 1)
    public void LoginByAdmin(){

        JiraJSONFixture loginBody = new JiraJSONFixture();
        String issue = loginBody.generateJSONForLogin();
        System.out.println(issue);
    }
*/

    @Test(priority = 1)
    public void createGoodStyleCampaign(){

        JiraJSONFixture jiraJSONFixture = new JiraJSONFixture();
        String campaign = jiraJSONFixture.generateJsonBodyForCampaign();

        IssueApi issueApi = new IssueApi();
        issueApi.createNewCampaign(campaign);

        assertEquals(issueApi.response.statusCode(), 200);
        assertTrue(issueApi.response.contentType().contains(ContentType.JSON.toString()));
    }

    @Test(priority = 2)
    public void createGoodStyleSocialForCampaign(){

        CampaignSocials campaignSocials = new CampaignSocials();
        String socialBody = campaignSocials.generateSocialNetworkWithMoneyForCampaign();

        IssueApi issueApi2 = new IssueApi();
        issueApi2.createSocialForCampaign(socialBody);

        assertEquals(issueApi2.response.statusCode(), 200);
        assertTrue(issueApi2.response.contentType().contains(ContentType.JSON.toString()));
    }
}
