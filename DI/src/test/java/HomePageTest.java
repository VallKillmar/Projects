import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void testListPostWebElements(){
        HomePage homePage = new HomePage(webDriver);
        homePage.getHeader().clickHomeButton();
        homePage.getHomePageMainElement().listOfAllPostElements();
    }

}
