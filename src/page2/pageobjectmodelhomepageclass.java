package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodelhomepageclass {
	//home  page class 
    WebDriver driver;

    public pageobjectmodelhomepageclass(WebDriver driver) {
        this.driver = driver;
    }
    
    By Fordsignin = By.xpath("//*[@id=\"brand-nav-user-li1-dsk\"]/a/span");
    By CreateFordaccountlogin = By.xpath("//*[@id=\\\"createAccount\\\"]");

    public void clickLoginLink() {
        driver.findElement(Fordsignin).click();
    }

    public void clickRegistrationLink() {
        driver.findElement(CreateFordaccountlogin).click();
    }
}
