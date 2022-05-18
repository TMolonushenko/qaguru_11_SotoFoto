package cloud.autotests.pageObject;

import com.codeborne.selenide.SelenideElement;

import static cloud.autotests.helpers.TestData.emailAddress;
import static cloud.autotests.helpers.TestData.firstname;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Account {
private final SelenideElement header =  $("div.card-header");
private final SelenideElement logoName =  $("div.card-body").$(byName("name"));
private final SelenideElement logoEmail =  $("div.card-body").$(byName("email"));

    public void openAccountPage() {
        open("account");
    }
    public void setCheckHeader() {
        header.shouldHave(text("Персональная информация"));;
    }

    public void setCheckLogoName() {
        logoName.shouldHave(value(firstname));
    }

    public void setCheckLogoEmail() {
       logoEmail.shouldHave(value(emailAddress));
    }
}
