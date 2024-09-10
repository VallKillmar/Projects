package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//public abstract class PageObject {
//    protected WebElement searchContext;
//
//    public PageObject(WebElement searchContext) {
//        PageFactory.initElements(searchContext, this);
//        this.searchContext = searchContext;
//    }
//
//    protected WebDriver getWrappedDriver(){
//        return ((WrapsDriver) searchContext).getWrappedDriver();
//    }
//
//}

public abstract class PageObject {
    protected WebElement searchContext;
    protected WebDriverWait wait;

    public PageObject(WebElement searchContext) {
        PageFactory.initElements(searchContext,this);
        this.searchContext = searchContext;
    }

//    protected WebDriver getWrappedDriver(){
//        return ((WrapsDriver) searchContext).getWrappedDriver();
//    }

//    protected WebDriverWait getWait(){
//        if (wait == null){
//            initialiseWait();
//        }
//        return wait;
//    }
//
//    private void initialiseWait (){
//        wait = new WebDriverWait(getWrappedDriver(), Duration.ofSeconds(5));
//    }


}
