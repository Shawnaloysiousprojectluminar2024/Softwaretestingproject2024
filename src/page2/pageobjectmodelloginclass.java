package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

public class pageobjectmodelloginclass {
    WebDriver driver;
    //login class

    public pageobjectmodelloginclass(WebDriver driver) {
        this.driver = driver;
    }
    By loginstart=By.id("//*[@id=\"brand-nav-user-btn-dsk\"]/span/span[1]/span[1]");
    By Signupstart=By.id("//*[@id=\"brand-nav-user-li1-dsk\"]/a/span");
    By Usernameemail = By.id("//*[@id=\"signInName\"]");
    By Password = By.id("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@id=\"next\"]");

    
    public void login(String login) {
    	driver.findElement(loginstart).click();
    }
    public void signup(String Signup) {
    	driver.findElement(Signupstart).click();
    }
    public void enterEmail(String UserName) {
        driver.findElement(Usernameemail).sendKeys("shawnaloysious@gmail.com");
    }

    public void enterPassword(String password) {
        driver.findElement(Password).sendKeys("Tutushawn2024-");
    }
    
    
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void takeScreenshot(String filePath) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("./screenshotoctoberproject2024//Ford.png"));
    }
}