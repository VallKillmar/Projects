package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeHeader extends PageObject{

//    private WebElement logoElement = searchContext.findElement(By.cssSelector("logo"));

//    private WebElement homeButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-home"));
    @FindBy(css = "a#nav-link-home")
    private WebElement homeButtonElement;
//    private WebElement logoHeaderElement = searchContext.findElement(By.cssSelector("img#homeIcon"));
    @FindBy(css = "img#homeIcon")
    private WebElement logoHeaderElement;
//    private WebElement loginButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-login"));
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
