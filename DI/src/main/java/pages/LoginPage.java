package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.LoginForm;
import pageObjects.ProfileHeaderForm;

public class LoginPage extends CommonPage{

//    private WebElement signInForm = driver.findElement(By.cssSelector("form.form-container"));

    @FindBy(css = "form.form-container")
    private WebElement signInForm;

    @FindBy(css = "nav.navbar")
    private WebElement headerElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginForm getLoginForm(){
        return new LoginForm(signInForm);
    }

    public ProfileHeaderForm getProfileHeader(){
        return new ProfileHeaderForm(headerElement);
    }

}
