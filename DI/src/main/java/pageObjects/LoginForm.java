package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{

    @FindBy(css = "input#defaultLoginFormUsername")
    private WebElement userNameInputElement;

    @FindBy(css = "input#defaultLoginFormPassword")
    private WebElement passwordInputElement;

    @FindBy(css = "button")
    private WebElement signInButtonElement;

    @FindBy(css = "input[type='checkbox']")
    private WebElement rememberMeCheckBoxElement;

    @FindBy(css = "p a")
    private WebElement registerButtonElement;


    public LoginForm(WebElement searchContext) {
        super(searchContext);
    }

    public void login(String username, String password) {
        userNameInputElement.sendKeys(username);
        passwordInputElement.sendKeys(password);
        signInButtonElement.click();
    }

    public String getUserNamePlaceHolder(){
        return userNameInputElement.getAttribute("placeholder");
    }

    public String getPasswordPlaceHolder(){
        return passwordInputElement.getAttribute("placeholder");
    }

    public void tickOnRememberMe(){
        rememberMeCheckBoxElement.click();
    }

    public void clickOnRegisterButton(){
        registerButtonElement.click();
    }

}
