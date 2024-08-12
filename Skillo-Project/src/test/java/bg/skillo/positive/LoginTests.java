package bg.skillo.positive;

import bg.skillo.main.BaseTest;
import bg.skillo.pages.SignIn;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void successfullyLogin(){
        SignIn.loadPage();
        SignIn.loginToPage("test75996", "757575");
//        Header.verifyLogoutButtonPresence("Login failed!");
        SignIn.verifyLoginFormToastValidationMessage("Successful login!", "Login failed!");
    }

}
