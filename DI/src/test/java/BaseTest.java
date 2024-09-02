import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.SignUpPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
//    protected SignUpPage signUpPage;

    @BeforeMethod
    public void setupDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        webDriver.get("http://training.skillo-bg.com:4200/users/login");
    }

    @BeforeMethod
    public void setupLoginPage(){
        loginPage = new LoginPage(webDriver);
    }

//    @BeforeMethod
//    public void setupSignUpPage(){
//        signUpPage = new SignUpPage(webDriver);
//    }

    @AfterMethod
    public void browserClose(){
        webDriver.quit();
    }
}
