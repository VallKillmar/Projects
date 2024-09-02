import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginForm;
import pageObjects.SignUpForm;
import pages.LoginPage;

public class SignUpTest extends BaseTest{

    @Test
    public void enterSignUpForm(){
        loginPage.getLoginForm().clickOnRegisterButton();
        String placeHolderText = signUpPage.getSignUpForm().getConfirmPasswordPlaceHolder();
        Assert.assertEquals(placeHolderText, "Confirm Password");
    }



}
