package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Footer;
import pageObjects.HomeHeader;
import pageObjects.ProfileHeader;
import pageObjects.SignUpForm;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

}
