package tests;

import org.testng.annotations.Test;
import pages.SignInPage;
import pages.MainPage;
import pages.RightMenuPage;
import pages.UserProfilePage;

public class UserProfileTests extends BaseTest {
    MainPage mainPage = new MainPage();
    SignInPage signInPage = new SignInPage();
    RightMenuPage rightMenuPage = new RightMenuPage();
    UserProfilePage userProfilePage = new UserProfilePage();


    @Test
    public void changeUserPasswordTest() {
        mainPage.clickOnLoginTitle();
        signInPage.logIn();
        mainPage.clickOnUserIcon();
        rightMenuPage.openChangeUserPasswordPage();
        userProfilePage
                .fillChangeUserPasswordFields()
                .clickOnChangePasswordButton()
                .getSuccessMessage("Password changed");

    }
}
