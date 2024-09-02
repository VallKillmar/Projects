package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SignUpForm extends PageObject {

//    private WebElement signUpSignElement = searchContext.findElement(By.cssSelector("h4.text-center"));
    private WebElement confirmPasswordElement = searchContext.findElement(By.cssSelector("input#defaultRegisterPhonePassword"));

    public SignUpForm(WebElement searchContext) {
        super(searchContext);
    }

    public String getConfirmPasswordPlaceHolder(){
        return confirmPasswordElement.getAttribute("placeholder");
    }

}
