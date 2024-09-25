import org.testng.annotations.Test;
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
    }
}
