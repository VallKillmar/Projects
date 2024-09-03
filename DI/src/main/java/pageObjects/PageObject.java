package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {
    protected WebElement searchContext;

    public PageObject(WebElement searchContext) {
        PageFactory.initElements(searchContext,this);
        this.searchContext = searchContext;
    }
}
