package PageObjects;

import Helpers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private By typeProduct = By.xpath
            ("//*[@id=\"page-product\"]/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/span/a");

    public String receiveTypeProductText() {
        String typeProductText = DriverManager.getDriver().findElement(typeProduct).getText();
        return typeProductText;
    }
}
