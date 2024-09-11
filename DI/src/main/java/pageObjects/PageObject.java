package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageObject {
    protected WebElement searchContext;
    protected WebDriverWait wait;

    public PageObject(WebElement searchContext) {
        PageFactory.initElements(searchContext,this);
        this.searchContext = searchContext;
    }

}
