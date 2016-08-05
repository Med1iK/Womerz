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
}
