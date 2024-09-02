package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeHeader extends PageObject{

//    private WebElement logoElement = searchContext.findElement(By.cssSelector("logo"));
//
    private WebElement homeButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-home"));
    private WebElement logoHeaderElement = searchContext.findElement(By.cssSelector("img#homeIcon"));

    public HomeHeader(WebElement searchContext) {
        super(searchContext);
    }

    public void clickLogoButton(){
        logoHeaderElement.click();
    }

    public void clickHomeButton(){
        homeButtonElement.click();
    }

}
