import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void testListPostWebElements(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
        homePage.getHomePageMainElement().listOfAllPostElements();
    }

    @Test
    public void testScrollHomePage(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
        homePage.scrollToTheBottom();
    }
}
