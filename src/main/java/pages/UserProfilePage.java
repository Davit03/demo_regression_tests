package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {
    public final String userPassword = "Test12345";

    public SelenideElement currentPasswordField = $(By.name("password"));
    public SelenideElement newPasswordField = $(By.name("new_password"));
    public SelenideElement confirmPasswordField = $(By.name("new_password_confirm"));
    public SelenideElement changePasswordButton = $("div.u-i-p-c-footer-bc > button");
    public SelenideElement successMessage = $("#root > div.popup-holder-bc.windowed.success > div > div > div > div > p");

    public UserProfilePage fillChangeUserPasswordFields() {
        currentPasswordField.sendKeys(userPassword);
        newPasswordField.sendKeys(userPassword);
        confirmPasswordField.sendKeys(userPassword);
        return this;
    }

    public UserProfilePage clickOnChangePasswordButton() {
        changePasswordButton.click();
        return this;
    }

    public UserProfilePage getSuccessMessage(String text) {
        successMessage.shouldHave(Condition.text(text));
        return this;
    }

}
