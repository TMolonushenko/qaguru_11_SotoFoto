package cloud.autotests.helpers;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {


    public static Faker faker = new Faker();

    public static final String firstname = faker.name().firstName();
    public static final String emailAddress = new Faker(new Locale("en")).internet().emailAddress();
    public static final String passwordInput = new Faker(new Locale("en")).internet().password();


}
