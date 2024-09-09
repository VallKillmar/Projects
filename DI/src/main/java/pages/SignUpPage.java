package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.LoginForm;
import pageObjects.SignUpForm;

public class SignUpPage extends CommonPage{

    @FindBy(css = "form.form-container")
    private WebElement signUpFormElement;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpForm getSignUpForm(){
        return new SignUpForm(signUpFormElement);
    }
}
