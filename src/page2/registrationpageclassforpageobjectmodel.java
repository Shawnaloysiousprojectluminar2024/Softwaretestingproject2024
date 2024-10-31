package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpageclassforpageobjectmodel {
    WebDriver driver;
    //registration page class

    public registrationpageclassforpageobjectmodel(WebDriver driver) {
        this.driver = driver;
    }
     By loginField=By.xpath("//*[@id=\"strongAuthenticationEmailVerificationControlReadOnly_but_verify_code\"]");
     By createaccountField=By.xpath("//*[@id=\"createAccount\"]");
    By emailField = By.id("//*[@id=\"email\"]");
    By clickcodeField=By.xpath("//*[@id=\"continue\"]");
    By SubmitcodeField=By.xpath("//*[@id=\"strongAuthenticationEmailVerificationControlReadOnly_but_verify_code\"]");
    By codeField=By.id("//*[@id=\"continue\"]");
    By PasswordField = By.id("//*[@id=\"newPassword\"]");
    By FirstnameField= By.id("//*[@id=\"givenName\"]");
    By LastnameField= By.id("//*[@id=\"surname\"]");
    By EmailVerfiedField= By.id("//*[@id=\"emailVerifiedReadonly\"]");
    By TermsandconditionsField=By.xpath("//*[@id=\"ConsentCheckboxOne_consent1\"]");
    By CreateaccountField=By.xpath("//*[@id=\"continue\"]");
    By fileUpload = By.id("file-upload");
    
    public void loginaccount(String login) {
    	driver.findElement(loginField).click();
    }
    public void createaccount (String createaccount) {
    	driver.findElement(createaccountField).click();
    }
    
    public void enteremail(String email) {
    	driver.findElement(emailField).sendKeys("shawnaloysious@gmail.com");
    }
    
    public void clickcodeField(String clickcode) {
    	driver.findElement(clickcodeField).click();
    }
  
    public void Submitcode(String Submitcode) {
    	driver.findElement(SubmitcodeField).click();
    }

    public void enterName(String Firstname) {
        driver.findElement(FirstnameField).sendKeys("Shawn");
    }

    public void enterEmail(String Lastname) {
        driver.findElement(LastnameField).sendKeys("Aloysious");
    }

    public void enterPassword(String Password) {
        driver.findElement(PasswordField).sendKeys("Tutushawn2024-");
    }
    public void Termsandconditions(String  Termsandcondition) {
    	driver.findElement(TermsandconditionsField).click();
    }
    
    

    

    public void uploadFile(String filePath) {
        driver.findElement(fileUpload).sendKeys(filePath);
    }

    public void submitRegistration() {
        driver.findElement(By.id("CreateaccountField")).click();
    }
    public void createacount() {
            driver.findElement (CreateaccountField).click();
        
    }
}
