import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.NewPostPage;

public class PostPictureTest extends BaseTest{

    @Test
    public void testPostPrivateImage(){
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

    @Test
    public void testPostPublicImage(){
        loginPage.loginToTheSystem();
        NewPostPage newPostPage = new NewPostPage(webDriver);
        newPostPage.waitToastValidationMessageInvisibility();
        newPostPage.getFullHeader().clickOnNewPostButtonElement();
        newPostPage.getPostAPictureForm().sendFileToPictureInputElement();
        newPostPage.getPostAPictureForm().clickOnSubmitButtonElement();
        CommonPage commonPage = new CommonPage(webDriver);
        commonPage.waitToastValidationMessageVisibility();
        String actualToastValidationMessage = commonPage.getToastValidationMessageElementText();
        Assert.assertEquals(actualToastValidationMessage, "Post created!");
    }
}
