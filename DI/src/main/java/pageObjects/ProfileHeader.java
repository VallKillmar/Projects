package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileHeader extends PageObject{

    public ProfileHeader(WebElement searchContext) {
        super(searchContext);
    }

    private WebElement profileButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-profile"));

    public void clickProfileButton(){
        profileButtonElement.click();
    }
}
