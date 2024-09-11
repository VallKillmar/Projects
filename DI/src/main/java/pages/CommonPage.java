package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

}
