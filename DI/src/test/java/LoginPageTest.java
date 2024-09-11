import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginForm;
import pageObjects.PageObject;
import pageObjects.ProfileForm;
import pages.HomePage;
import pages.ProfilePage;

public class LoginPageTest extends BaseTest{

    @Test
    public void testLoginPage(){
        LoginForm form = loginPage.getLoginForm();
        form.login("te4eto", "astigae");
//        Thread.sleep(2000);
        loginPage.getProfileHeader().clickProfileButton();
        ProfilePage profilePage = new ProfilePage(webDriver);
        String className = profilePage.getProfileForm().getEditProfilePicElementAppears();
        Assert.assertEquals(className, "edit-profile-pic ng-star-inserted");
    }

    @Test
    public void userNamePlaceHolderTest(){
        String placeHolderText = loginPage.getLoginForm().getUserNamePlaceHolder();
        Assert.assertEquals(placeHolderText, "Username or email");
    }

    @Test
    public void passwordPlaceHolderTest(){
        String placeHolderText = loginPage.getLoginForm().getPasswordPlaceHolder();
        Assert.assertEquals(placeHolderText, "Password");
    }

    @Test
    public void clickOnRememberMeTest(){
        LoginForm form = loginPage.getLoginForm();
        form.tickOnRememberMe();
        //verification needed
    }

}
