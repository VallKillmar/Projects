import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{

    private List<WebElement> componentElements = driver.findElements(By.cssSelector("div.component"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<Component> getAllComponents(){
        List<Component> components = new ArrayList<Component>();
        for (WebElement componentElement : componentElements) {

            Component tempComponent = new Component(componentElement);
            components.add(tempComponent);
        }

        return components;
    }

    public Component getComponentByTitle(String title) {
        List<Component> allComponents = getAllComponents();
        Component resultComponent = null;

        for (Component component : allComponents) {

            if(component.getTitle().equals(title)) {
                resultComponent = component;
            }
        }

        return resultComponent;
    }






}
