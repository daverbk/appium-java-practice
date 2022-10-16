package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.err;

public class MobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        var options = new UiAutomator2Options();

        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);

        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setDeviceName("Pixel_3a_API_33_x86_64");

        try {
            return new AndroidDriver(getAppiumServerUrl(), options);
        } catch (MalformedURLException e) {
            err.println("Something's wrong with appium server host - check the URL.");
            throw new RuntimeException(e.getMessage());
        }
    }

    private URL getAppiumServerUrl() throws MalformedURLException {
            return new URL("http://localhost:4723/wd/hub");
    }
}
