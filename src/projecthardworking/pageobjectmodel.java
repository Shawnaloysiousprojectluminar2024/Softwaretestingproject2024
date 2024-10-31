package projecthardworking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodel {
    WebDriver driver;
    
    //HomePage Class (Navigate to Login and Registration)

    // Constructor
    public pageobjectmodel(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Login link
    By loginLink = By.xpath("//a[contains(text(), 'Sign Up or Log In')]");
    
    // Method to click Login link
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
}
