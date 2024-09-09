package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileHeader extends PageObject{

    public ProfileHeader(WebElement searchContext) {
        super(searchContext);
    }

//    private WebElement profileButtonElement = searchContext.findElement(By.cssSelector("a#nav-link-profile"));
    @FindBy(css = "a#nav-link-profile")
    private WebElement profileButtonElement;

    public void clickProfileButton(){
        profileButtonElement.click();
    }
}
