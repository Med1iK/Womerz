package uipages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://apiwomerz.wbd.co.il/auth/facebook")
public class AuthorizationPage extends PageObject {


    @FindBy(id = "email")
    private WebElementFacade UserEmail;

    @FindBy(id = "pass")
    private WebElementFacade UserPassword;

    @FindBy(id = "u_0_2")
    private WebElementFacade LoginButton;

    public void EnterUserEmail(String UserEmail) {
        this.UserEmail.sendKeys(UserEmail);
    }

    public void EnterUserPassword(String UserPassword){
        this.UserPassword.sendKeys(UserPassword);
    }
    public void ClickOnLoginButton(){
        this.LoginButton.click();
    }

}
