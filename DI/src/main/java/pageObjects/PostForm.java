package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostForm extends PageObject{

    @FindBy(css = "button.browse")
    private WebElement browseForAPictureButtonElement;

    public PostForm(WebElement searchContext) {
        super(searchContext);
    }

    public void clickBrowseForAPictureButtonElement(){
        browseForAPictureButtonElement.click();
    }

}
