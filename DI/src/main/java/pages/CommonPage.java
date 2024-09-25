package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Footer;
import pageObjects.HomeHeaderForm;
import pageObjects.LoginForm;
import pageObjects.ProfileHeaderForm;

public class CommonPage extends BasePage{

    private LoginPage loginPage;

    @FindBy(css = "header.header-container")
    private WebElement headerElement;

    @FindBy(css = "footer.d-none")
    private WebElement footerElement;

    @FindBy(css = ".toast-message")
    private WebElement toastValidationMessageElement;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public HomeHeaderForm getHeader(){
        return new HomeHeaderForm(headerElement);
    }

    public ProfileHeaderForm getFullHeader(){
        return new ProfileHeaderForm(headerElement);
    }

    public Footer getFooter(){
        return new Footer(footerElement);
    }

    public void loginToTheSystem(){
        loginPage = new LoginPage(driver);
        LoginForm form = loginPage.getLoginForm();
        form.login("te4eto", "astigae");
    }

    public void scrollToTheBottom(){
        Actions actions = new Actions(driver);
        actions.moveToElement(footerElement).perform();
    }

    public void waitToastValidationMessageVisibility(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
    }

    public void waitToastValidationMessageInvisibility(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".toast-message")));
    }

    public String getToastValidationMessageElementText(){
        return toastValidationMessageElement.getText();
    }
}
