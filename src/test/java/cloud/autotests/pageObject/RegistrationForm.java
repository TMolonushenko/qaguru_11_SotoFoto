package cloud.autotests.pageObject;

import com.codeborne.selenide.SelenideElement;

import static cloud.autotests.helpers.TestData.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {
    private final SelenideElement title = $(byLinkText("Регистрация"));
    private final SelenideElement name = $(byName("name"));
    private final SelenideElement email = $(byName("email"));
    private final SelenideElement password = $(byName("password"));
    private final SelenideElement password_confirmation = $(byName("password_confirmation"));

    private final SelenideElement buttonSubmit = $("button.btn-block");


    public void clickTitle() {
        title.click();
    }


    public void setFirstNameInput() {
        this.name.setValue(firstname).pressEnter();

    }

    public void setEmailInput() {
        this.email.setValue(emailAddress).pressEnter();

    }

    public void setPasswordInput() {
        this.password.setValue(passwordInput).pressEnter();

    }

    public void setPasswordConfirmationInput() {
        this.password_confirmation.setValue(passwordInput).click();
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();

    }
}
