import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionsPratik {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("test kurulumu tamamladı, test başlıyor");
    }

    @Test
    //Assert.assertTrue (actualDataWE.isDisplayed());
    public void fullNameDisplayedTest() {
        driver.get("https://demoqa.com/text-box");
        WebElement currentAddressWE = driver.findElement(By.id("currentAddress-label"));
        String actualData = currentAddressWE.getText();
        String expectData = "Current Address";
        Assertions.assertTrue(currentAddressWE.isDisplayed());
        System.out.println(actualData);
    }

    @RepeatedTest(3)
    //Assert.assertTrue (actualData.equals(expectedData));
    public void hobbiesTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement hobbiesWE = driver.findElement(By.xpath("(//label[@id='subjects-label'])[2]"));
        String actualData = hobbiesWE.getText();
        String expectData = "Hobbies";
        Assertions.assertTrue(actualData.equals(expectData));
        System.out.println(actualData);
    }

    @Test //@Test(timeout = 1000 junit 4 yazımı artık kullanılmıyor bunun yerine aşağıdaki @Timeout anotasyonu şeklinde yazılıyor
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    //Assert.assertEquals (expectedData, actualData);
    public void titleTest() {
        driver.get("https://www.toolsqa.com/selenium-training/");
        String actualData = driver.getTitle();
        String expectData = "Tools QA - Selenium Training";
        Assertions.assertEquals(expectData, actualData);
        System.out.println(actualData);
    }
    @Ignore("addressTest atlandı") // bu çalışmıyor bunun yerine @Disabled var artık
    @Disabled("fullNameVerifyTest atlandı")
    @Test
    //Assert.assertTrue (actualData.contains("16"));
    public void fullNameVerifyTest() {
        driver.get("https://demoqa.com/text-box");
        WebElement currentAddressWE = driver.findElement(By.id("currentAddress-label"));
        String actualData = currentAddressWE.getText();
        String expectData = "Current Address";
        Assertions.assertTrue(actualData.contains("urrent"));
        System.out.println(actualData);
    }
    @Test
    //Assert.assertFalse(actualData.contains("18"));
    public void addressTest() {
        driver.get("https://demoqa.com/text-box");
        WebElement currentAddressWE = driver.findElement(By.id("currentAddress-label"));
        String actualData = currentAddressWE.getText();
        String expectData = "Current Address";
        Assertions.assertTrue(actualData.contains("Current"));
        System.out.println(actualData);
    }

    @AfterAll
    public static void teardown(){
        System.out.println("test sonlandırılıyor");
        driver.quit();
    }


}


