package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static constants.LocatorConstants.ID_PREFIX;

public class OnboardingPage {
    private SelenideElement skipOnboardingButton = $(AppiumBy.id(ID_PREFIX + "fragment_onboarding_skip_button"));

    public void skipOnboarding() {
        skipOnboardingButton.click();
    }
}
