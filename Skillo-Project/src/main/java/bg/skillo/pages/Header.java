package bg.skillo.pages;

import bg.skillo.utils.BaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import static bg.skillo.utils.Browser.driver;


public class Header extends BaseActions {

    private static final By LOGOUT_BUTTON = By.cssSelector(".nav-link .fas");

    /**
     * Verify the presence of Logout button in the header
     * @param messageOnFailure a message that you are not logged in
     */
    public static void verifyLogoutButtonPresence(String messageOnFailure) {
        try {
            boolean logoutButton = driver.findElement(LOGOUT_BUTTON).isDisplayed();
        }catch(Exception e) {
            Assert.fail(messageOnFailure);
        }
    }

}