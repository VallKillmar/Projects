package bg.skillo.negative;

import bg.skillo.main.BaseTest;
import bg.skillo.pages.SignIn;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginFailedWithWrongPassword() {
        SignIn.loadPage();
        SignIn.loginToPage("test75996","nevermind");
        SignIn.verifyLoginFormToastValidationMessage("Ivalid password", "Issue: Login with wrong password did not failed!");
    }

    @Test
    public void loginFailedWithWrongUser() {
        SignIn.loadPage();
        SignIn.loginToPage("wed12e", "757575");
        SignIn.verifyLoginFormToastValidationMessage("User not found", "Issue: Login with wrong user did not failed!");
    }

    @Test
    public void loginFailedWithNoCredentials() {
        SignIn.loadPage();
        SignIn.loginToPage("", "");
        SignIn.verifyLoginFormToastValidationMessage("UsernameOrEmail cannot be empty", "Issue: Login without credentials did not failed!");
    }
}
