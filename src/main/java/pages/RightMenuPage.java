package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class RightMenuPage {
    public SelenideElement myProfileTitle = $("div.u-i-p-links-lists-holder-bc > div:nth-child(4) > span");
    public SelenideElement changePasswordTitle = $("a:nth-child(2) > span");

    public RightMenuPage openChangeUserPasswordPage() {
        myProfileTitle.click();
        changePasswordTitle.click();
        return this;
    }
}
