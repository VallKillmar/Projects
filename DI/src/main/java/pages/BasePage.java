package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Footer;
import pageObjects.Header;

import java.sql.Driver;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public Header getHeader(){
        WebElement headerElement = driver.findElement(By.cssSelector("header.header-container"));
        return new Header(headerElement);
    }

    public Footer getFooter(){
        WebElement footerElement = driver.findElement(By.cssSelector("footer.d-none"));
        return new Footer(footerElement);
    }
}
