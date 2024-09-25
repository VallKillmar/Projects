import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.NewPostPage;

public class PostPictureTest extends BaseTest{

    @Test
    public void testPostAnImage(){
        loginPage.loginToTheSystem();
        NewPostPage newPostPage = new NewPostPage(webDriver);
        newPostPage.getFullHeader().clickOnNewPostButtonElement();
        newPostPage.getPostAPictureForm().sendFileToPictureInputElement();
        newPostPage.getPostAPictureForm().clickOnPrivatePublicSwitchElement();
        newPostPage.getPostAPictureForm().clickOnSubmitButtonElement();
        newPostPage.waitToastValidationMessage();
        String actualToastValidationMessage = newPostPage.getToastValidationMessageElementText();
        Assert.assertEquals(actualToastValidationMessage, "Post created!");
    }
}
