package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}

