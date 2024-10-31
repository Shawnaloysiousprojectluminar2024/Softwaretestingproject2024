package projecthardworking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class today1 {

	public static void main(String[] args) throws InterruptedException {

		//Instantiating chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Opening web application
		driver.get("https://www.shcollege.ac.in/");
		
		//Locating the Login button and clicking on it
		driver.findElement(By.id("//*[@id=\"sh-college\"]/div[1]/div/div/div[2]/div[1]/h4[3]/a")).click();
		driver.findElement(By.id("//*[@id=\"post-12131\"]/section/div/div/div/div[2]/div[2]/div/h1/a")).click();
		//Locating the username & password and passing the credentials
		driver.findElement(By.id("//*[@id=\"UserName\"]")).sendKeys("21UBBA2119");
		driver.findElement(By.id("//*[@id=\"Password\"]")).sendKeys("23052002");
		driver.findElement(By.id("/html/body/div[1]/div/div/div/div/div[2]/div/fieldset/form/div[2]/div/label")).click();
		//Click on the login button
		driver.findElement(By.id("//*[@id=\"frmLogin\"]/div[3]/button")).click();
		
		//Print the web page heading
		System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"sh-college\"]/div[1]/div/div[1]/div[1]/a/svg/g[2]/image")).getText());

		//Click on Logout button
		driver.findElement(By.id("//*[@id=\"frmLogin\"]/div[3]/button")).click();
		
		//Close driver instance
		//driver.quit();
	}

}