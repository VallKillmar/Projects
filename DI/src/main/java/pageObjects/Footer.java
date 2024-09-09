package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends PageObject{
    public Footer(WebElement searchContext) {
        super(searchContext);
    }

    @FindBy(css = "div.col-5 div")
    private WebElement versionStampElement;

    public String getVersionText(){
        return versionStampElement.getText();
    }
}
