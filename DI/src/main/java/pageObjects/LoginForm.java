package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{

//    private WebElement userNameInputElement = searchContext.findElement(By.cssSelector("input#defaultLoginFormUsername"));
    @FindBy(css = "input#defaultLoginFormUsername")
    private WebElement userNameInputElement;

//    private WebElement passwordInputElement = searchContext.findElement(By.cssSelector("input#defaultLoginFormPassword"));
    @FindBy(css = "input#defaultLoginFormPassword")
    private WebElement passwordInputElement;

//    private WebElement signInButtonElement = searchContext.findElement(By.cssSelector("button"));
    @FindBy(css = "button")
    private WebElement signInButtonElement;

//    private WebElement rememberMeCheckBoxElement = searchContext.findElement(By.cssSelector("input[type='checkbox']"));
    @FindBy(css = "input[type='checkbox']")
    private WebElement rememberMeCheckBoxElement;

//    private WebElement registerButtonElement = searchContext.findElement(By.cssSelector("p a"));
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
