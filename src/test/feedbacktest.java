package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.feedback;

//import page.Rajagiri_home_feedback;

public class feedbacktest 
{
	WebDriver d;
	@BeforeClass
	public void bc() 
	{
		d=new ChromeDriver();
		d.get("https://www.rajagirihospital.com/");
	}
	@Test
	public void test() throws InterruptedException, IOException
	{
		feedback  rf = new feedback (d);
		d.manage().window().maximize();
		rf.feedback("Ajin", "biju", "Alappuzha");
		rf.title_verification();
		rf.screenshot();
	}
	@AfterTest
	public void at()
	{
		d.close();
	}

}