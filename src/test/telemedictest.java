package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.booking;

public class telemedictest 
{
	WebDriver d;
	@BeforeClass
	public void bc()
	{
		d = new ChromeDriver();
		d.get("https://booking.rajagirihospital.com/search");	
	}
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		
		booking rt = new booking(d);
		rt.search("cardiology");
		rt.date("Sep");
		rt.checkbox();
		rt.tverification();
		rt.screenshot();
	}
	
}