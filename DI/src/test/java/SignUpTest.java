import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginForm;
import pageObjects.SignUpForm;
import pages.BasePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpTest extends BaseTest{

    @Test
    public void enterSignUpForm(){
        loginPage.getLoginForm().clickOnRegisterButton();
        SignUpPage signUpPage = new SignUpPage(webDriver);
        String placeHolderText = signUpPage.getSignUpForm().getConfirmPasswordPlaceHolder();
        Assert.assertEquals(placeHolderText, "Confirm Password");
    }

    @Test
    public void checkTheUsernameValidationMessage(){

    }

}
