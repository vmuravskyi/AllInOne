//package com.softserve.edu.Selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import org.testng.asserts.SoftAssert;
//
//import java.util.concurrent.TimeUnit;
//
//public class TestXPath {
//    private static WebDriver driver;
//
//    @BeforeClass
//    public void beforeClass() {
////        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverManager.chromedriver().setup();
//        if (driver == null)
//        driver = new ChromeDriver();
//    }
//
//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }
//
//    @BeforeMethod
//    public void setUp() {
//        driver.get("http://taqc-opencart.epizy.com/");
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        // logout, get(urlLogout), delete cookie, delete cache
//    }
//
//
//    @Test
//    public void searchByXpath() {
//        SoftAssert softAssert = new SoftAssert();
//        driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
//        driver.findElement(By.xpath("//button[@name='USD']")).click();
//        driver.findElement(By.xpath("//input[@name='search']")).clear();
//        driver.findElement(By.xpath("//input[@name='search']")).click();
//        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");
//        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//        WebElement price = driver.findElement(By.xpath("//h4/a[contains(@href, 'id=43')]/../following-sibling::p[@class='price']"));
//        System.out.println(price.getText());
//        String priceStr = price.getText();
//        String[] priceMas = priceStr.split("\n");
//        double priceDouble = Double.valueOf(priceMas[0].replace("$", ""));
//        softAssert.assertEquals(priceDouble, 601.00);
//        Assert.assertEquals(priceDouble, 601.00);
//        driver.findElement(By.xpath("//img[contains(@src, 'logo.png')]")).click();
//    }
//
//
//}
