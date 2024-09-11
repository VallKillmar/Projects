package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileHeaderForm extends PageObject {

    public ProfileHeaderForm(WebElement searchContext) {
        super(searchContext);
    }

    @FindBy(css = "a#nav-link-profile")
    private WebElement profileButtonElement;

    @FindBy(css = "a#nav-link-new-post")
    private WebElement newPostButtonElement;

    @FindBy(css = "input#search-bar")
    private WebElement searchBarInputElement;

    @FindBy(css = "div.dropdown-container")
    private WebElement searchResultsDropDownElement;

    @FindBy(css = "div.dropdown-user")
    private WebElement profileResultDropDownElement;

    @FindBy(css = "a.post-user")
    private WebElement userProfileButtonOnDropDownElement;

    @FindBy(css = "button.btn-primary")
    private WebElement followDropDownButtonElement;

    @FindBy(css = "i.fa-sign-out-alt")
    private WebElement signOutButtonElement;

    public void clickProfileButton() {
        profileButtonElement.click();
    }

    public void clickNewPostButton(){
        newPostButtonElement.click();
    }

    public void searchForUser(String searchKeyword){
        searchBarInputElement.sendKeys(searchKeyword);
    }

    public String getResultUserFromDropDown(){
        return userProfileButtonOnDropDownElement.getText();
    }
}
