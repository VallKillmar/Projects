import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginForm;
import pageObjects.PageObject;
import pageObjects.ProfileForm;
import pages.CommonPage;
import pages.HomePage;
import pages.ProfilePage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginPage() {
//        Thread.sleep(2000);
        loginPage.loginToTheSystem();
        loginPage.getProfileHeader().clickProfileButton();
        ProfilePage profilePage = new ProfilePage(webDriver);
        String className = profilePage.getProfileForm().getEditProfilePicElementAppears();
        Assert.assertEquals(className, "edit-profile-pic ng-star-inserted");
    }

    @Test
    public void userNamePlaceHolderTest() {
        String placeHolderText = loginPage.getLoginForm().getUserNamePlaceHolder();
        Assert.assertEquals(placeHolderText, "Username or email");
    }

    @Test
    public void passwordPlaceHolderTest() {
        String placeHolderText = loginPage.getLoginForm().getPasswordPlaceHolder();
        Assert.assertEquals(placeHolderText, "Password");
    }

    @Test
    public void clickOnRememberMeTest() {
        LoginForm form = loginPage.getLoginForm();
        form.tickOnRememberMe();
        Assert.assertTrue(form.verifyRememberMeIsTicked(),"the checkbox is not ticked");
    }
}
