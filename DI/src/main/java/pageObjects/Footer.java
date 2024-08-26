package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Footer extends PageObject{
    public Footer(WebElement searchContext) {
        super(searchContext);
    }

    private WebElement versionStampElement = searchContext.findElement(By.cssSelector("div.col-5 div"));

    public String getVersionText(){
        return versionStampElement.getText();
    }
}
