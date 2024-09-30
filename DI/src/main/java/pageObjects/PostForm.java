package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostForm extends PageObject{

    @FindBy(css = "button.browse")
    private WebElement browseForAPictureButtonElement;

    @FindBy(css = "input.file")
    private WebElement uploadPictureInputElement;

    @FindBy(css = "span.custom-switch")
    private WebElement privatePublicSwitchElement;

    @FindBy(css = "button#create-post")
    private WebElement submitButtonElement;

    public PostForm(WebElement searchContext) {
        super(searchContext);
    }

    public void clickBrowseButtonElement(){
        browseForAPictureButtonElement.click();
    }

    public void sendFileToPictureInputElement(){
        String fileName = "C:/Screen.jpg";
        uploadPictureInputElement.sendKeys(fileName);
    }

    public void clickOnPrivatePublicSwitchElement(){
        privatePublicSwitchElement.click();
    }

    public void clickOnSubmitButtonElement(){
        submitButtonElement.click();
    }

}
