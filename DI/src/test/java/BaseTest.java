import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;

    @BeforeTest
    public void setupDriver(){
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        webDriver.get("http://training.skillo-bg.com:4200/users/login");
    }

    @BeforeMethod
    public void setupLoginPage(){
        loginPage = new LoginPage(webDriver);
    }

//    @AfterMethod
//    public void browserClose(){
//        webDriver.quit();
//    }
}
