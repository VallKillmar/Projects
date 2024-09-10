package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileForm extends PageObject{

    @FindBy(css = "div.edit-profile-pic")
    private WebElement editProfilePicElement;

    public ProfileForm(WebElement searchContext) {
        super(searchContext);
    }

    public String getEditProfilePicElementAppears(){
        return editProfilePicElement.getAttribute("class");
    }

}
