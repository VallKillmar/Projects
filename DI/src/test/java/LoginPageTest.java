import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Header;
import pageObjects.LoginForm;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{

    @Test
    public void testLoginPage() throws InterruptedException {
        LoginForm form = loginPage.getLoginForm();
        form.login("te4eto", "astigae");
//        Thread.sleep(2000);
        loginPage.getHeader().clickProfileButton();
    }

    @Test
    public void testHomePageButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
    }

    @Test
    public void testHomePageThroughLogoButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickLogoButton();
    }

    @Test
    public void placeHolderTest(){
        String placeHolderText = loginPage.getLoginForm().getUserNamePlaceHolder();
        Assert.assertEquals(placeHolderText, "Username or email");
    }

    @Test
    public void footerVersionCheck(){
        HomePage homePage = new HomePage(webDriver);
        String versionText = homePage.getFooter().getVersionText();
        Assert.assertEquals(versionText,"Version: 2020.3.1.4200");
    }
}
