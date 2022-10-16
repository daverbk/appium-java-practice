package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constants.LocatorConstants.ID_PREFIX;

public class SearchPage  {
    private SelenideElement searchCard = $(AppiumBy.id(ID_PREFIX + "search_card"));
    private SelenideElement searchField = $(AppiumBy.id(ID_PREFIX + "search_src_text"));
    private ElementsCollection searchResults = $$(AppiumBy.xpath(
            "//*[@resource-id='" + ID_PREFIX +
            "search_results_list']/*[contains(@class,'android.view.ViewGroup')]" +
            "/*[@resource-id = '" + ID_PREFIX + "page_list_item_title']"));

    public ElementsCollection search(String value) {
        searchCard.click();
        searchField.sendKeys(value);
        return searchResults;
    }
}
