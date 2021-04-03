package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    public final String userEmail = "davit.vardanyan@betconstruct.com";
    public final String userPassword = "Test12345";

    public SelenideElement emailField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement signInButton = $("div.entrance-form-actions-holder-bc.login-ext-1 > div > button");

    public SignInPage typeInEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SignInPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public SignInPage clickOnSigninButton() {
        signInButton.shouldBe(Condition.enabled);
        signInButton.click();
        return this;
    }

    public SignInPage logIn() {
        typeInEmailField(userEmail);
        typeInPasswordField(userPassword);
        clickOnSigninButton();
        return this;
    }

}
