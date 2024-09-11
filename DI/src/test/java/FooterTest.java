import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class FooterTest extends BaseTest{

    @Test
    public void footerVersionCheck(){
        HomePage homePage = new HomePage(webDriver);
        String versionText = homePage.getFooter().getVersionText();
        Assert.assertEquals(versionText,"Version: 2020.3.1.4200");
    }
}
