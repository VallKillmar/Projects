package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseTestMethod;
import pages.BasePage;

public class TestListener implements ITestListener{

    private WebDriver webDriver;

    // This method will be invoked when a test fails
    @Override
    public void onTestFailure(ITestResult result) {
        // Capture the WebDriver instance from the test class
        Object currentClass = result.getInstance();
        webDriver = ((BaseTest) currentClass).getDriver();

        // Capture the screenshot
        String methodName = result.getMethod().getMethodName();
        Screenshot.captureScreenshot(webDriver, methodName);
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Optional: Code to execute before each test
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Optional: Code to execute after a successful test
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Optional: Code to execute if a test is skipped
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Optional: Code to execute for partial test failures
    }

    @Override
    public void onStart(ITestContext context) {
        // Optional: Code to execute before any test starts
    }

    @Override
    public void onFinish(ITestContext context) {
        // Optional: Code to execute after all tests have finished
    }
}