import Hi.System;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MtsOnlineTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://mts.by");
        driver.findElement(By.id("cookie-agree")).click();

    }

    // Проверить название блока
    @Test
    public void testBlockName() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners")));
        Assert.assertTrue(blockTitle.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: Visa
    @Test
    public void testLogoVisa() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(1) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: Visa Verified by
    @Test
    public void testLogoVisaVerified() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(2) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: MasterCard
    @Test
    public void testLogoMasterCard() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(3) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: MasterCard SecureCode
    @Test
    public void testLogoMasterCardSecureCode() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(4) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: БЕЛКАРТ
    @Test
    public void testLogoBelCart() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(5) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить наличие логотипов платёжных систем: МИР
    @Test
    public void testLogoMir() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(6) > img")));
        Assert.assertTrue(paymentLogos.isDisplayed());
    }

    // Проверить работу ссылки "Подробнее о сервисе"
    @Test
    public void testDetailService() {
        WebElement detailsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Подробнее о сервисе")));
        detailsLink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        driver.navigate().back();
    }
    @AfterEach
    public void testDetailServiceQuit() {
        driver.quit();
    }

    // Заполнить поля и проверить работу кнопки "Продолжить"
    @Test
            public void testServiceType() {
    WebElement serviceType = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__form > div.select > div.select__wrapper > button > span.select__now")));
        serviceType.click();
    WebElement phoneNumberField = driver.findElement(By.cssSelector("#connection-phone"));
        phoneNumberField.sendKeys("297777777");
    WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection > button"));
        continueButton.click();
}


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


