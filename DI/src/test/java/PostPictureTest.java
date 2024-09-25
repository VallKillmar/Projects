import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.PageObject;
import pages.NewPostPage;

public class PostPictureTest extends BaseTest{

    @Test
    public void testPostAnImage(){
        loginPage.loginToTheSystem();
        NewPostPage newPostPage = new NewPostPage(webDriver);
        newPostPage.getFullHeader().clickOnNewPostButtonElement();
        newPostPage.getPostAPictureForm().clickBrowseForAPictureButtonElement();

    }
}
