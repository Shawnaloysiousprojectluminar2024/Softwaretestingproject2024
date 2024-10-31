package test2;

//import org.junit.platform.commons.util.ExceptionUtils.getData;
//import org.junit.platform.commons.util.ExceptionUtils.getData;
//import org.junit.platform.commons.util.ExcilUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page2.pageobjectmodelhomepageclass;
import page2.pageobjectmodelloginclass;
import page2.registrationpageclassforpageobjectmodel;
import java.io.IOException;

public class Testclassdatadriventesting {
	//test class for datadriven
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://login.ford.com/4566605f-43a7-400a-946e-89cc9fdb0bd7/B2C_1A_SignInSignUp_en-US/oauth2/v2.0/authorize?redirect_uri=https%3A%2F%2Fwww.ford.com%2Flogin%2F&response_type=code&state=%7B%22policy%22%3A%22email_susi_policy%22%2C%22lang%22%3A%22en_us%22%2C%22state%22%3A%22%22%2C%22queryHash%22%3A%22%22%2C%22forwardUrl%22%3A%22aHR0cHM6Ly93d3cuZm9yZC5jb20v%22%7D&client_id=98569d7d-cfed-4ede-a134-875acc6e97d1&scope=98569d7d-cfed-4ede-a134-875acc6e97d1%20openid&code_challenge=4olYoUdvEwQvK-Tmrf2Fbz0X_loziI2OOkEPICRlqSQ&code_challenge_method=S256&ui_locales=en-US&template_id=Ford-MFA-Authentication&ford_application_id=CCCA9FB8-B941-46AD-A89F-F9D9D699DD68&country_code=USA&language_code=en-US");
        driver.manage().window().maximize();
    }

    @DataProvider(name = "registrationData")
    public Object[][] registrationData() throws IOException {
        return Exception.getData("\"D:Fordlogin.xlsx\"", "Sheet1");
    }

    @Test(dataProvider = "registrationData")
    public void registrationTest(String login,String createaccount,String email,String clickcode,String Submitcode,String Firstname,String Lastname, String Password,String filePath) {
    	registrationpageclassforpageobjectmodel registrationPage = new registrationpageclassforpageobjectmodel(driver);
    	
        registrationPage.createaccount(createaccount);
        registrationPage.enterEmail(email);
        registrationPage.clickcodeField(clickcode);
        registrationPage.Submitcode(Submitcode);
        registrationPage.enterName(Firstname);
        registrationPage.enterName(Lastname);
        registrationPage.enterPassword(Password);
       
        registrationPage.enterName(filePath);
        
        registrationPage.submitRegistration();
    }

    @Test
    public void loginTest() throws IOException {
        pageobjectmodelhomepageclass homePage = new pageobjectmodelhomepageclass(driver);
        pageobjectmodelloginclass loginPage = new pageobjectmodelloginclass(driver);

        homePage.clickLoginLink();
        loginPage.enterEmail("shawnaloysious@example.com");
        loginPage.enterPassword("\"Tutushawn2024-\"");
        loginPage.clickLoginButton();

        loginPage.takeScreenshot("./screenshotoctoberproject2024//Ford4.png");
        Assert.assertTrue(driver.getTitle().contains("Ford"), "Login unsuccessful");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
