package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileForm extends PageObject{

    public ProfileForm(WebElement searchContext) {
        super(searchContext);
    }

    @FindBy(css = "div.edit-profile-pic")
    private WebElement editProfilePicElement;

    public String getEditProfilePicElementAppears(){
        return editProfilePicElement.getAttribute("class");
    }

}
