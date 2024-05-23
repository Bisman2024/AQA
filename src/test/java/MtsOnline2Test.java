import Hi.System;
import io.qameta.allure.*;
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

@Epic("MTS Online Services")
@Feature("Payment Services")
public class MtsOnline2Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    @Step("Browser setup and navigate to MTS main page")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://mts.by");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Fill in Communication Services Form")
    @Description("Test filling in the communication services form with phone number, amount, and email.")
    public void testFillingCommunicationServicesForm() {
        // Заполнение формы "Услуги связи"
        driver.findElement(By.cssSelector("#connection-phone")).sendKeys("297777777");
        driver.findElement(By.cssSelector("#connection-sum")).sendKeys("100");
        driver.findElement(By.cssSelector("#connection-email")).sendKeys("mts@mailtest.ru");
        driver.findElement(By.cssSelector("#pay-connection > button")).click();
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Story("Confirmation Dialog Data")
    public void testConfirmationDialogData() {
        WebElement confirmationDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app-wrapper__content']")));
        Assert.assertEquals(confirmationDialog.findElement(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > div > span")).getText(), "375297777777");
        Assert.assertEquals(confirmationDialog.findElement(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > div > div > span:nth-child(1)")).getText(), "100.00 BYN");
        Assert.assertEquals(confirmationDialog.findElement(By.xpath("html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()")).getText(), "Оплатить 100.00 BYN");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Story("Checking placeholder compliance")
    public void testCardDetailsPlaceholders() {
        WebElement confirmationDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/app-root/div/div/div")));
        checkPlaceholder("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c60-0 > div:nth-child(1) > app-input > div > div > div.content.ng-tns-c45-1 > label", "Номер карты");
        checkPlaceholder("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c60-0 > div:nth-child(2) > div.expires-input.ng-tns-c60-0.ng-star-inserted > app-input > div > div > div.content.ng-tns-c45-4 > label", "Срок действия");
        checkPlaceholder("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c60-0 > div:nth-child(2) > div.cvc-input.ng-tns-c60-0.ng-star-inserted > app-input > div > div > div.content.ng-tns-c45-5 > label", "CVC");
        checkPlaceholder("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c60-0 > div:nth-child(3) > app-input > div > div > div.content.ng-tns-c45-3 > label", "Имя держателя (как на карте)");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Story("Checking for buttons")
    public void testPaymentSystemIcons() {
        WebElement paymentLogos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gpay-button-online-api-id")));
        Assert.assertTrue(paymentLogos.isDisplayed());
        WebElement paymentLogos1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#yandex-button > button")));
        Assert.assertTrue(paymentLogos1.isDisplayed());
    }

    @Step("Check placeholder")
    private void checkPlaceholder(String cssSelector, String expectedPlaceholder) {
        WebElement field = driver.findElement(By.cssSelector(cssSelector));
        String actualPlaceholder = field.getAttribute("placeholder");
        Assert.assertEquals(actualPlaceholder, expectedPlaceholder);
    }


   /* @AfterClass
    @Step("Close Browser")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}