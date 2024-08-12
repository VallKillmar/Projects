package bg.skillo.utils;

import org.openqa.selenium.By;

public class BaseActions {

    /**
     * Find an element by locator and send a text
     * @param locator the locator string (x-pad, css, id ...)
     * @param text the string we want to add in the element
     */
    protected static void type(By locator, String text) {
        Browser.driver.findElement(locator).sendKeys(text);
    }

    /**
     * Find an element by locator and clicks on it
     * @param locator the locator string (x-pad, css, id ...)
     */
    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }

    /**
     * Find an element by locator and get the text of the element
     * @param locator the locator string (x-pad, css, id ...)
     * @return returns the text found in the element
     */
    protected static String getText(By locator) {
        return Browser.driver.findElement(locator).getText();
    }

}
