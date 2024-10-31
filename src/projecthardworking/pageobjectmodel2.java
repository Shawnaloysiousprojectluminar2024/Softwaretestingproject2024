package projecthardworking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

public class pageobjectmodel2 {
	//LoginPage Class
    WebDriver driver;

    public pageobjectmodel2(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By emailField = By.id("login-email");
    By passwordField = By.id("login-password");
    By loginButton = By.xpath("//button[@type='submit']");
    By fileUploadInput = By.id("file-upload"); // Example ID for file upload

    // Methods
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void handleAlert() {
        driver.switchTo().alert().accept();
    }

    public void takeScreenshot(String filePath) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(filePath));
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileUploadInput).sendKeys(filePath);
    }
}
