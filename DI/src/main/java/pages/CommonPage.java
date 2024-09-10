package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.Footer;
import pageObjects.HomeHeader;
import pageObjects.ProfileHeader;

public class CommonPage extends BasePage{

    @FindBy(css = "nav.navbar")
    private WebElement headerElement;

    @FindBy(css = "footer.d-none")
    private WebElement footerElement;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public HomeHeader getHomeHeader(){
        return new HomeHeader(headerElement);
    }

    public Footer getFooter(){
        return new Footer(footerElement);
    }
}
