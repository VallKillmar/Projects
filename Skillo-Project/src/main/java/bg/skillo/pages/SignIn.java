package bg.skillo.pages;

import bg.skillo.utils.BaseActions;
import bg.skillo.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static bg.skillo.utils.Browser.driver;

public class SignIn extends BaseActions {

    private static final String ADMIN_LOGIN_URL = "http://training.skillo-bg.com:4200/users/login";
    private static final By USERNAME_INPUT_FIELD = By.cssSelector("#defaultLoginFormUsername");
    private static final By PASSWORD_INPUT_FIELD = By.cssSelector("#defaultLoginFormPassword");
    private static final By LOGIN_BUTTON = By.cssSelector("#sign-in-button");


    public static void loadPage(){
        Browser.driver.get(ADMIN_LOGIN_URL);
    }

    public static void loginToPage(String username, String password){
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        click(LOGIN_BUTTON);
    }

    public static void verifyLoginFormToastValidationMessage(String expectedLoginFormToastValidationMessage, String messageOnFailure){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
        String actualLoginFormToastValidationMessage = getText(By.cssSelector(".toast-message"));
        Assert.assertTrue(actualLoginFormToastValidationMessage.contains(expectedLoginFormToastValidationMessage),messageOnFailure);
    }

}
