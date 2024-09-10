package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.LoginForm;
import pageObjects.ProfileForm;

public class ProfilePage extends CommonPage{

    @FindBy(css = "div.container-fluid")
    private WebElement profileForm;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfileForm getProfileForm(){
        return new ProfileForm(profileForm);
    }

}
