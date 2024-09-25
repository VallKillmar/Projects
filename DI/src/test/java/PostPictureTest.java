import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.NewPostPage;

public class PostPictureTest extends BaseTest{

    @Test
    public void testPostAnImage() throws InterruptedException {
        loginPage.loginToTheSystem();
        NewPostPage newPostPage = new NewPostPage(webDriver);
        newPostPage.waitToastValidationMessageInvisibility();
        newPostPage.getFullHeader().clickOnNewPostButtonElement();
        newPostPage.getPostAPictureForm().sendFileToPictureInputElement();
        newPostPage.getPostAPictureForm().clickOnPrivatePublicSwitchElement();
        newPostPage.getPostAPictureForm().clickOnSubmitButtonElement();
        CommonPage commonPage = new CommonPage(webDriver);
        commonPage.waitToastValidationMessageVisibility();
        String actualToastValidationMessage = commonPage.getToastValidationMessageElementText();
        Assert.assertEquals(actualToastValidationMessage, "Post created!");
    }
}
