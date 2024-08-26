package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Header extends PageObject{

//    private WebElement logoElement = searchContext.findElement(By.cssSelector("logo"));
//
    private WebElement homeButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-home"));
    private WebElement profileButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-profile"));
    private WebElement logoHeaderElement = searchContext.findElement(By.cssSelector("img#homeIcon"));

    public Header(WebElement searchContext) {
        super(searchContext);
    }

    public void clickLogoButton(){
        logoHeaderElement.click();
    }

    public void clickHomeButton(){
        homeButtonElement.click();
    }

    public void clickProfileButton(){
        profileButtonElement.click();
    }
}
