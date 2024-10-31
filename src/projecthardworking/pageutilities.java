package projecthardworking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageutilities {
    WebDriver driver;

    public pageutilities(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for registration fields and date picker
    By nameField = By.id("register-name");
    By emailField = By.id("register-email");
    By passwordField = By.id("register-password");
    By datePicker = By.id("date-picker"); // Example ID for date picker

    // Methods
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectDate(String date) {
        driver.findElement(datePicker).sendKeys(date); // Assumes date input as a text field
    }

    public void submitRegistration() {
        driver.findElement(By.id("register-submit")).click(); // Example submit button ID
    }
}
