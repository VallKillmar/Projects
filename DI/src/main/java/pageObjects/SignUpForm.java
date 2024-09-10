package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SignUpForm extends PageObject {

//    private WebElement signUpSignElement = searchContext.findElement(By.cssSelector("h4.text-center"));

    @FindBy(css = "input#defaultRegisterPhonePassword")
    private WebElement confirmPasswordPlaceholderElement;

    @FindBy(css = "form div.input-filed:first-of-type input")
    private WebElement usernamePlaceholderElement;

    @FindBy(css = "form div.input-filed:first-of-type span")
    private WebElement invalidUsernameFeedbackElement;

    public SignUpForm(WebElement searchContext) {
        super(searchContext);
    }

    public String getConfirmPasswordPlaceHolder(){
        return confirmPasswordPlaceholderElement.getAttribute("placeholder");
    }

    public void clickOnConfirmPasswordPlaceHolder(){
        confirmPasswordPlaceholderElement.click();
    }

    public String getUsernamePlaceholder(){
        return usernamePlaceholderElement.getAttribute("placeholder");
    }

    public void clickOnUsernameElement(){
        usernamePlaceholderElement.click();
    }

    public String getInvalidUsernameFeedbackText(){
        return invalidUsernameFeedbackElement.getText();
    }

    public void signUp(String userName, String password, String email){
        usernamePlaceholderElement.sendKeys(userName);
        confirmPasswordPlaceholderElement.sendKeys(password);
    }

}
