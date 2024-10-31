package projecthardworking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Example: LoginPage.java
public class loginpage {
 WebDriver driver;
     
 
 By username = By.id("user-name");
 By password = By.id("password");
 By loginButton = By.id("login-button");

 public loginpage(WebDriver driver) {
     this.driver = driver;
 }

 public void setUsername(String user) {
     driver.findElement(username).sendKeys(user);
 }

 public void setPassword(String pass) {
     driver.findElement(password).sendKeys(pass);
 }

 public void clickLogin() {
     driver.findElement(loginButton).click();
 }
}
