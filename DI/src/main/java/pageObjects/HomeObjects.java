package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeObjects extends PageObject{

    @FindBy(css = "footer.d-none")
    private WebElement footerElement;

    @FindBy(css = "a.post-user")
    private List<WebElement> postElement;

    private WebDriver driver;

    public HomeObjects(WebElement searchContext, WebDriver driver) {
        super(searchContext);
        this.driver = driver;
    }

    public void listOfAllPostElements(){
        List<WebElement> postElements = postElement;
        for(WebElement postObject : postElements){
            System.out.println(postObject.getText()); // further list implementation
        }
    }

    public void scrollToTheBottom(){
        Actions actions = new Actions(driver);
        actions.moveToElement(footerElement).perform();
    }
}
