package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.$;
import static constants.LocatorConstants.ID_PREFIX;

public class NavigationTab {
    private SelenideElement searchButton = $(AppiumBy.id(ID_PREFIX + "nav_tab_search"));

    public SearchPage clickSearchButton(){
        searchButton.click();

        return new SearchPage();
    }
}
