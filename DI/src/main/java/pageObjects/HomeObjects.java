package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeObjects extends PageObject{

    @FindBy(css = "a.post-user")
    private List<WebElement> postElement;

    public HomeObjects(WebElement searchContext) {
        super(searchContext);
    }

    public void takeListOfAllPostElements(){
        List<WebElement> postElements = postElement;
        for(WebElement postObject : postElements){
            System.out.println(postObject.getText()); // further list implementation
        }
    }

}
