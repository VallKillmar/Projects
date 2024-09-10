package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

public class HomeHeader extends PageObject{

//    private WebElement logoElement = searchContext.findElement(By.cssSelector("logo"));

    @FindBy(css = "a#nav-link-home")
    private WebElement homeButtonElement;

    @FindBy(css = "img#homeIcon")
    private WebElement logoHeaderElement;

    @FindBy(css = "a#nav-link-login")
    private WebElement loginButtonElement;

    public HomeHeader(WebElement searchContext) {
        super(searchContext);
    }

    public void clickLogoButton(){
        logoHeaderElement.click();
    }

    public void clickHomeButton(){
        homeButtonElement.click();
    }

    public void clickLoginButton(){
        loginButtonElement.click();
    }

}
