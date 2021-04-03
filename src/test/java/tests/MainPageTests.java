package tests;

import org.testng.annotations.Test;
import pages.SignInPage;
import pages.MainPage;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void logInTest() {
        mainPage.clickOnLoginTitle();
        signInPage.logIn();
        mainPage.clickOnUserIcon();
        mainPage.getUserName("Davit Vardanyan");

    }

    @Test
    public void changeAppLanguageToEnglish() {
        mainPage.selectAppLanguage("eng")
                .getLanguageText("Sign in");

    }

    @Test
    public void changeAppLanguageToRussian() {
        mainPage.selectAppLanguage("rus")
                .getLanguageText("вход");

    }

    @Test
    public void changeAppLanguageToArmenian() {
        mainPage.selectAppLanguage("arm")
                .getLanguageText("Մուտք");

    }

    @Test
    public void changeAppLanguageToGeorgian() {
        mainPage.selectAppLanguage("geo")
                .getLanguageText("ავტორიზაცია");

    }

    @Test
    public void changeAppLanguageToPersian() {
        mainPage.selectAppLanguage("fas")
                .getLanguageText("ورود");

    }


}
