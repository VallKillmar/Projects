import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

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
    public void footerVersionCheck(){
        HomePage homePage = new HomePage(webDriver);
        String versionText = homePage.getFooter().getVersionText();
        Assert.assertEquals(versionText,"Version: 2020.3.1.4200");
    }
}
