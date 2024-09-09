package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class PageObject {
    protected WebElement searchContext;
    protected WebDriverWait wait;

    public PageObject(WebElement searchContext) {
        PageFactory.initElements(searchContext,this);
        this.searchContext = searchContext;
        wait = new WebDriverWait(getWrappedDriver(), Duration.ofSeconds(5));
    }

    protected WebDriver getWrappedDriver(){
        return ((WrapsDriver) searchContext).getWrappedDriver();
    }


}
