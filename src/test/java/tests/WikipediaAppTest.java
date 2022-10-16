package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.ExploreTab;

import static com.codeborne.selenide.CollectionCondition.*;

public class WikipediaAppTest extends BaseTest {

    private static ExploreTab exploreTab;

    @BeforeAll
    static void setUpPages() {
        exploreTab = new ExploreTab();
    }

    @Test
    public void searchTest() {
        var valueToSearch = "Car";

        exploreTab.navigationTab
                .clickSearchButton()
                .search(valueToSearch)
                .should((containExactTextsCaseSensitive(valueToSearch)));
    }
}
