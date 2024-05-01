package Hi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liftm\\IdeaProjects\\PZ_13.3\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        driver.get("https://mts.by");
        driver.findElement(By.id("cookie-agree")).click();
        driver.quit();



    }
}