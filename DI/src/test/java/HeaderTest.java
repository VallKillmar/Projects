import org.testng.annotations.Test;
import pageObjects.ProfileHeaderForm;
import pages.HomePage;
import pages.ProfilePage;

public class HeaderTest extends BaseTest{

    @Test
    public void testHeaderHomePageButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
    }

    @Test
    public void testHeaderLoginButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickLoginButton();
    }

    @Test
    public void testHomePageThroughHeaderLogoButton(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickLogoButton();
    }

    @Test
    public void testSearchForUserInput(){
        loginPage.loginToTheSystem();
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.getFullHeader().searchForUser("test");

    }
}
