import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void testListPostedWebElements(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
        homePage.getHomePageMainElement().takeListOfAllPostedElements();
        homePage.scrollToTheBottom();
        homePage.loaderIndicatorWait();
        homePage.getHomePageMainElement().takeListOfAllPostedElements();
    }

    @Test
    public void testScrollHomePage(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
        homePage.scrollToTheBottom();
    }
}
