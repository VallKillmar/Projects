package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.Footer;
import pageObjects.HomeHeaderForm;

public class CommonPage extends BasePage{

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

    public Footer getFooter(){
        return new Footer(footerElement);
    }
}
