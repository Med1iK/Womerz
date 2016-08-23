import apis.CampaignBody;
import apis.IssueApi;
import apis.LoginBody;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest {

    @Test(priority = 1)
    public void LoginByAdmin(){

        LoginBody loginBody = new LoginBody();
        String issue = loginBody.generateJSONBodyForLogin();

        System.out.println(issue);
    }


    @Test(priority = 2)
    public void createGoodStyleCampaign(){

       // String issueToken = null;

        CampaignBody campaignBody = new CampaignBody();
        String campaignB = campaignBody.generateJsonBodyForCampaign();

        IssueApi issueApi = new IssueApi();
        issueApi.createNewCampaign(campaignB);

       // assertEquals(issueApi.response.statusCode(), 200);
        //assertTrue(issueApi.response.contentType().contains(ContentType.APPLICATION_JSON.toString()));

       // issueToken = issueApi.extractResponseByPath("token");
        System.out.println(campaignB );
    }
}
