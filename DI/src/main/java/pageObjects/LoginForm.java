package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm extends PageObject{
    private WebElement userNameInputElement = searchContext.findElement(By.cssSelector("input#defaultLoginFormUsername"));

    private WebElement passwordInputElement = searchContext.findElement(By.cssSelector("input#defaultLoginFormPassword"));

    private WebElement signInButtonElement = searchContext.findElement(By.cssSelector("button"));

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

    public String getUserNameActualValue(){
        return userNameInputElement.getText();
    }
}
