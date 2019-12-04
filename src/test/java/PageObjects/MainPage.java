package PageObjects;

import Helpers.DriverManager;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class MainPage extends AbstractPage {

    private By headerSearchField = By.xpath("//*[@id=\"searchbox\"]");
    private By headerSearchButton = By.xpath("//*[@id=\"doSearch\"]");
    private By buttonOk = By.xpath
            ("/html/body/header/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/span[1]");

    public MainPage openMainPage() {
        String mainPageAddress = "http://hotline.ua";
        DriverManager.getDriver().get(mainPageAddress);
        return this;
    }

    public MainPage clickOk() {
        DriverManager.getDriver().findElement(buttonOk).click();
        return this;
    }

    //ввести поисковый текст
    public MainPage enterSearchText(String searchText) {
        DriverManager.getDriver().findElement(headerSearchField).sendKeys(searchText);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    //нажать на кнопку подтверждения поиска
    public SearchPage clickSearchSubmit() {
        DriverManager.getDriver().findElement(headerSearchButton).click();
        return new SearchPage();
    }
}
