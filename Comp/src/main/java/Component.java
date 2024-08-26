import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Component extends PageObject{

    private WebElement titleElement = searchContext.findElement(By.cssSelector("h2"));

    private WebElement buttonElement = searchContext.findElement(By.cssSelector("button"));

    public Component(WebElement searchContext) {
        super(searchContext);
    }

    public String getTitle() {
        return titleElement.getText();
    }

    public void clickButton() {
        buttonElement.click();
    }
}
