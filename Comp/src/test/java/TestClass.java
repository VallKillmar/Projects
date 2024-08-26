import org.testng.annotations.Test;

public class TestClass extends BaseTest{

    @Test
    public void test() {
        HomePage page = new HomePage(driver);
        var component = page.getComponentByTitle("Component 2");
        component.clickButton();
    }
}
