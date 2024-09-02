package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginForm;
import pageObjects.SignUpForm;

public class SignUpPage extends BasePage{

    private WebElement signUpForm = driver.findElement(By.cssSelector("form.form-container"));

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpForm getSignUpForm(){
        return new SignUpForm(signUpForm);
    }

}
