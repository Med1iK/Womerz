import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import uisteps.AuthorizationPageUser;

@RunWith(SerenityRunner.class)
public class UITest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Before
    public void setUp(){
        succsessfullyLogin();
    }

    @Steps
    public AuthorizationPageUser authorizationPageUser;

    @Test
    public void succsessfullyLogin(){
        authorizationPageUser.GoToLoginPage();
        authorizationPageUser.EnterUserEmail("********");
        authorizationPageUser.EnterUserPassword("********");
        authorizationPageUser.ClickOnLoginButton();
        authorizationPageUser.EnterUserSecondPassword("********");
        authorizationPageUser.ClickOnContinueButton();
    }
}
