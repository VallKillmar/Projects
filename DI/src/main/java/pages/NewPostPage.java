package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.PageObject;
import pageObjects.PostForm;
import pageObjects.ProfileForm;

public class NewPostPage extends CommonPage{

    @FindBy(css = "form.form-container")
    private WebElement postAPictureForm;

    public NewPostPage(WebDriver driver) {
        super(driver);
    }

    public PostForm getPostAPictureForm(){
        wait.until(webDriver -> postAPictureForm.isDisplayed());
        return new PostForm(postAPictureForm);
    }
}
