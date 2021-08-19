package com.softserve.edu.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SearchTest {
    private static WebDriver driver;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @BeforeMethod
    public void setUp() {
        driver.get("http://taqc-opencart.epizy.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        // logout, get(urlLogout), delete cookie, delete cache
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
//        driver.findElement(By.cssSelector("button.currency-select.btn.btn-link.btn-block[name='USD']")).click();
        driver.findElement(By.cssSelector("[name='USD']")).click();
        driver.findElement(By.cssSelector("#search > input")).sendKeys("MacBook", Keys.ENTER);
//        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
        String macPrice = driver.findElement(By.xpath
                ("//a[contains(@href, 'id=44')]/ancestor::h4//parent::div/p[contains(@class, 'price')]")).getText();
        String[] split = macPrice.split("\n");
        macPrice = split[0];
        macPrice = macPrice.replace("$", "").replace(",", "");
        double macPriceDouble = Double.parseDouble(macPrice);
        System.out.println(macPriceDouble);
        System.out.println(macPriceDouble/2);
//        Thread.sleep(2000); // FOR PRESENTATION PURPOSE


    }
}
