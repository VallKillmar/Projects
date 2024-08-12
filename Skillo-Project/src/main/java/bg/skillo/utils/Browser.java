package bg.skillo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class Browser {

    public static WebDriver driver;

    /**
     * Opens a new default Chrome browser window and sets
     * an implicit wait of 10 seconds
     */
    public static void open() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Quits the browser process by closing all associated windows with it
     */
    public static void quit() {
        driver.quit();
    }
}
