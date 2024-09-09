import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpPageTest extends BaseTest{

    @Test
    public void enterSignUpForm(){
        loginPage.getLoginForm().clickOnRegisterButton();
        SignUpPage signUpPage = new SignUpPage(webDriver);
        String placeHolderText = signUpPage.getSignUpForm().getConfirmPasswordPlaceHolder();
        Assert.assertEquals(placeHolderText, "Confirm Password");
    }

    @Test
    public void checkTheUsernameValidationMessage(){
        loginPage.getLoginForm().clickOnRegisterButton();
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.getSignUpForm().clickOnUsernameElement();
        signUpPage.getSignUpForm().clickOnConfirmPasswordPlaceHolder();
        String invalidFeedbackText = signUpPage.getSignUpForm().getInvalidUsernameFeedbackText();
        Assert.assertEquals(invalidFeedbackText,"This field is required!");

    }

}
