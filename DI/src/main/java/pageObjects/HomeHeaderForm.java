package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeHeaderForm extends PageObject{

    @FindBy(css = "a#nav-link-home")
    private WebElement homeButtonElement;

    @FindBy(css = "img#homeIcon")
    private WebElement logoHeaderElement;

    @FindBy(css = "a#nav-link-login")
    private WebElement loginButtonElement;

    public HomeHeaderForm(WebElement searchContext) {
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
