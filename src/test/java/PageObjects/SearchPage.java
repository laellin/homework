package PageObjects;

import Helpers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchPage {

    private By firstProduct = By.xpath("//*[@id=\"page-search\"]/div[2]/div/div[1]/div[3]/div/ul/li[1]/div[2]/p/a");
    private By sortLink = By.xpath("//*[@id=\"page-search\"]/div[2]/div/div[1]/div[2]/ul/li/select");
    private By sortPriceOption = By.xpath("//*[@id=\"page-search\"]/div[2]/div/div[1]/div[2]/ul/li/select/option[2]");
    private By listProducts = By.className("product-item");
    //      xpath("//*[@id=\"catalog-products\"]/div/ul/li");
    private By priceProduct = By.xpath(".//div[@class=\"product-item\"]//div[@class=\"price-md\"]");
    private By nextPage = By.className("next");

    public ProductPage openFirstProduct() {
        DriverManager.getDriver().findElement(firstProduct).click();
        return new ProductPage();
    }

    public SearchPage clickSortLink() {
        DriverManager.getDriver().findElement(sortLink).click();
        return this;
    }

    public SearchPage clickSortPriceOption() {
        DriverManager.getDriver().findElement(sortPriceOption).click();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public List<WebElement> getListOfProducts() {
        List<WebElement> listOfProducts = DriverManager.getDriver().findElements(listProducts);
        return listOfProducts;
    }

    public SearchPage goToNextPage() {
        DriverManager.getDriver().findElement(nextPage).click();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
}
