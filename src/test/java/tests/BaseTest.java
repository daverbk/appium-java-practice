package tests;

import com.codeborne.selenide.Configuration;
import drivers.MobileDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.OnboardingPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    static void setup() {
        setUpSelenide();
    }

    @BeforeEach
    void startDriver() {
        open();
        skipOnboarding();
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }

    static void setUpSelenide() {
        Configuration.browser = MobileDriver.class.getName();
        Configuration.browserSize = null;
    }

    static void skipOnboarding() {
        new OnboardingPage().skipOnboarding();
    }
}

