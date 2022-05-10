package old.other;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

    private static final String knopka = "/html/body/app-root/div/div/rz-product/div/product-tab-main/div[1]/div[2]/div[2]/product-comments-tab-main/section/a";
    private static final String url = "https://rozetka.com.ua/";
    private static ChromeDriver driver;

    private static void initialize() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVisibile() {
        return driver.findElement(By.xpath(knopka)).isDisplayed() ? true : false;
    }

    public static void main(String[] args) {
        initialize();
        driver.get(url);
        while (isVisibile()) {
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        }
        sleep();
        driver.quit();
    }


}
