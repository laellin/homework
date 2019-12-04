package Tests;

import PageObjects.MainPage;
import PageObjects.SearchPage;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;

public class PriceTest extends AbstractTest {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void priceTvTest() {
        mainPage.openMainPage();
        mainPage.clickOk();
        mainPage.enterSearchText("телевизор");
        mainPage.clickSearchSubmit();
        searchPage.clickSortLink();
        searchPage.clickSortPriceOption();
        List<WebElement> list = searchPage.getListOfProducts();
        System.out.println(list.size());

        for (int i = 0; i < 4; i++) {
            searchPage.goToNextPage();
            list.addAll(searchPage.getListOfProducts());
        }
        System.out.println(list.size());
    }
}
