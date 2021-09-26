package seleniumRealTime.ten;

import seleniumRealTime.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Practice extends Base {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = initialize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
