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
        profilePage.getProfileForm().getEditProfilePicElementAppears();
    }

    @Test
    public void testHomePageButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomeHeader().clickHomeButton();
    }

    @Test
    public void testLoginButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomeHeader().clickLoginButton();
    }

    @Test
    public void testHomePageThroughLogoButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomeHeader().clickLogoButton();
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

    @Test
    public void footerVersionCheck(){
        HomePage homePage = new HomePage(webDriver);
        String versionText = homePage.getFooter().getVersionText();
        Assert.assertEquals(versionText,"Version: 2020.3.1.4200");
    }
}
