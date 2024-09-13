package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.HomeObjects;

public class HomePage extends CommonPage{

    @FindBy(css = "div.post-list-container")
    private WebElement homePageMainElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomeObjects getHomePageMainElement(){
        return new HomeObjects(homePageMainElement, driver);
    }
}
