package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.Footer;
import pageObjects.HomeHeader;
import pageObjects.ProfileHeader;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public HomeHeader getHomeHeader(){
        WebElement headerElement = driver.findElement(By.cssSelector("nav.navbar"));
        return new HomeHeader(headerElement);
    }

    public ProfileHeader getProfileHeader(){
        WebElement headerElement = driver.findElement(By.cssSelector("nav.navbar"));
        return new ProfileHeader(headerElement);
    }

    public Footer getFooter(){
        WebElement footerElement = driver.findElement(By.cssSelector("footer.d-none"));
        return new Footer(footerElement);
    }
}
