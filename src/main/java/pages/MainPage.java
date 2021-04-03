package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends SignInPage {

    public SelenideElement loginTitle = $("button.btn.s-small.sign-in");
    public SelenideElement userIcon = $("div.hdr-user-bc > i");
    public SelenideElement userName = $("span.u-i-p-p-u-i-d-username-bc.ellipsis");
    public SelenideElement selectLanguage = $("div:nth-child(2) > div > label > select");


    public MainPage clickOnLoginTitle() {
        loginTitle.click();
        return this;
    }

    public MainPage clickOnUserIcon() {
        userIcon.click();
        return this;
    }

    public MainPage getUserName(String text) {
        userName.shouldHave(Condition.text(text));
        return this;
    }


    public MainPage selectAppLanguage(String text) {
        selectLanguage.selectOptionByValue(text);
        return this;
    }

    public MainPage getLanguageText(String text) {
        loginTitle.shouldHave(Condition.text(text));
        return this;
    }

}
