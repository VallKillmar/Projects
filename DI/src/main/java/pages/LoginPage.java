package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.LoginForm;
import pageObjects.ProfileHeader;

public class LoginPage extends CommonPage{

//    private WebElement signInForm = driver.findElement(By.cssSelector("form.form-container"));

    @FindBy(css = "form.form-container")
    private WebElement signInForm;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginForm getLoginForm(){
        return new LoginForm(signInForm);
    }

    public ProfileHeader getProfileHeader(){
        WebElement headerElement = driver.findElement(By.cssSelector("nav.navbar"));
        return new ProfileHeader(headerElement);
    }
}
