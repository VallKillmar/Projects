package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginForm;

public class LoginPage extends BasePage{

    private WebElement signInForm = driver.findElement(By.cssSelector("form.form-container"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginForm getLoginForm(){
        return new LoginForm(signInForm);
    }
}
