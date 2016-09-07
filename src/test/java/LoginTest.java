import fixtures.CampaignBody;
import apis.IssueApi;
import fixtures.LoginBody;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import com.jayway.restassured.http.ContentType;


@Test(groups = {"API", "LoginTest"})
public class LoginTest {

/*    @Test(priority = 1)
    public void LoginByAdmin(){

        LoginBody loginBody = new LoginBody();
        String issue = loginBody.generateJSONBodyForLogin();
        System.out.println(issue);
    }*/

    @Test//(priority = 2)
    public void createGoodStyleCampaign(){

      // String issueToken = null;

        CampaignBody campaignBody = new CampaignBody();
        String campaign = campaignBody.generateJsonBodyForCampaign();

        IssueApi issueApi = new IssueApi();
        issueApi.createNewCampaign(campaign);
        System.out.println("WHTF" + issueApi);
        System.out.println("HEHEH" + campaign);

        assertEquals(issueApi.response.statusCode(), 200);
        assertTrue(issueApi.response.contentType().contains(ContentType.JSON.toString()));

    }
}
