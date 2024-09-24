package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.HomeObjects;

public class HomePage extends CommonPage{

    @FindBy(css = "div.post-list-container")
    private WebElement homePageMainElement;

    @FindBy(css = "div.loader")
    private WebElement loaderElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomeObjects getHomePageMainElement(){
        return new HomeObjects(homePageMainElement);
    }

    public void waitLoaderIndicator(){
        wait.until(ExpectedConditions.visibilityOf(loaderElement));
        wait.until(ExpectedConditions.invisibilityOf(loaderElement));
    }
}
