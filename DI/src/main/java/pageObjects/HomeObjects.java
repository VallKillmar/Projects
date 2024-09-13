package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeObjects extends PageObject{

    private WebDriver driver;

//    @FindBy(css = "div.post-feed-container")
//    private WebElement postElement;

    public HomeObjects(WebElement searchContext, WebDriver driver) {
        super(searchContext);
        this.driver = driver;
    }

    public void listOfAllPostElements(){
        List<WebElement> postElements = driver.findElements(By.cssSelector("a.post-user"));

        for(WebElement postObject : postElements){
            System.out.println(postObject.getText());
        }
    }


}
