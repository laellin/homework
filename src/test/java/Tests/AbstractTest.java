package Tests;

import Helpers.DriverManager;
import org.junit.After;

public class AbstractTest {
    @After
    public void quitDriver() {
        DriverManager.quitDriver();
    }

}
