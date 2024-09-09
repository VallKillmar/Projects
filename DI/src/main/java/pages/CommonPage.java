package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.Footer;
import pageObjects.HomeHeader;
import pageObjects.ProfileHeader;

public class CommonPage extends BasePage{

    @FindBy(css = "nav.navbar")
    private WebElement headerElement;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public HomeHeader getHomeHeader(){
        return new HomeHeader(headerElement);
    }

    public Footer getFooter(){
        WebElement footerElement = driver.findElement(By.cssSelector("footer.d-none"));//rework
        return new Footer(footerElement);
    }
}
