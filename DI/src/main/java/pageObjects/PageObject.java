package pageObjects;

import org.openqa.selenium.WebElement;

public abstract class PageObject {
    protected WebElement searchContext;

    public PageObject(WebElement searchContext) {
        this.searchContext = searchContext;
    }
}
