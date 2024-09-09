package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Footer;
import pageObjects.HomeHeader;
import pageObjects.ProfileHeader;
import pageObjects.SignUpForm;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
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

    public SignUpForm getSignUpForm(){
        WebElement signUpForm = driver.findElement(By.cssSelector("form.form-container"));
        return new SignUpForm(signUpForm);
    }
}
