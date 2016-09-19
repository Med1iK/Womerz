package uisteps;


import net.thucydides.core.annotations.Step;
import uipages.AuthorizationPage;

public class AuthorizationPageUser {

        AuthorizationPage authorizationPage;

    @Step
    public void GoToLoginPage(){
        authorizationPage.open();
    }

    @Step
    public void EnterUserEmail(String UserEmail){
        authorizationPage.EnterUserEmail(UserEmail);
    }

    @Step
    public void EnterUserPassword(String UserPassword){
        authorizationPage.EnterUserPassword(UserPassword);
    }

    @Step
    public void ClickOnLoginButton(){
        authorizationPage.ClickOnLoginButton();
    }
}
