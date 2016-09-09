import apis.IssueApi;
import fixtures.JiraJSONFixture;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import com.jayway.restassured.http.ContentType;


//@Test(groups = {"API", "LoginTest"})
public class LoginTest {

/*    @Test(priority = 1)
    public void LoginByAdmin(){

        JiraJSONFixture loginBody = new JiraJSONFixture();
        String issue = loginBody.generateJSONForLogin();
        System.out.println(issue);
    }*/

    @Test//(priority = 2)
    public void createGoodStyleCampaign(){

      // String issueToken = null;

        JiraJSONFixture jiraJSONFixture = new JiraJSONFixture();
        String campaign = jiraJSONFixture.generateJsonBodyForCampaign();

        IssueApi issueApi = new IssueApi();
        issueApi.createNewCampaign(campaign);

        assertEquals(issueApi.response.statusCode(), 200);
        assertTrue(issueApi.response.contentType().contains(ContentType.JSON.toString()));
        System.out.println("YEEE" + issueApi.response.toString());
    }
}
