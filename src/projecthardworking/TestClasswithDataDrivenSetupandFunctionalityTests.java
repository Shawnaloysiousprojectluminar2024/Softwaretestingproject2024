package projecthardworking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v107.serviceworker.model.RegistrationID;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClasswithDataDrivenSetupandFunctionalityTests {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.adidas.com/");
        driver.manage().window().maximize();
    }

    @DataProvider(name = "registrationData")
    public Object[][] registrationData() throws Exception {
        // Implement your method to fetch data from Excel
        return new Object[][] {
            {"John Doe", "john@example.com", "password123", "01/01/1990"},
            {"Jane Smith", "jane@example.com", "password456", "02/02/1991"}
        };
    }

    @Test(dataProvider = "registrationData")
    public void registrationTest(String name, String email, String password, String date) throws InterruptedException {
        RegistrationID registrationPage = new Registrationid(driver);
         registrationPage.enterName(name);
        registrationPage.enterEmail(email);
        registrationPage.enterPassword(password);
        registrationPage.selectDate(date);
        registrationPage.submitRegistration();
    }

    @Test
    public void loginTest() throws IOException, InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickLoginLink();
        loginPage.enterEmail("your-email@example.com");
        loginPage.enterPassword("your_password");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        loginPage.takeScreenshot("path_to_save_screenshot");
        Assert.assertTrue(driver.getTitle().contains("Adidas"), "Login unsuccessful");
    }

    @Test
    public void alertHandlingTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.handleAlert();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
