package Tests;

import PageObjects.MainPage;
import PageObjects.ProductPage;
import PageObjects.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class TvTest extends AbstractTest {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();

    String searchText = "телевизор";

    @Test
    public void typeTvTest() {
        mainPage.openMainPage();
        mainPage.clickOk();
        mainPage.enterSearchText(searchText);
        mainPage.clickSearchSubmit();
        searchPage.openFirstProduct();
        String typeProductText = productPage.receiveTypeProductText();
        Assert.assertTrue(typeProductText.toLowerCase().contains(searchText));
    }

}
