package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//import page.Rajagiri_page;
import page.page;

public class rajigiritest extends Baseclass
{
@Test
public void test() throws InterruptedException, IOException
{
	page r = new page(d);
	d.manage().window().maximize();
	Thread.sleep(2000);
	r.click1();
	r.details("AJIN", "BIJU");
	r.dropdowns();
	r.nextpage();
	r.title_verification();
	r.screenshot();
}
@AfterTest
public void at()
{
	d.close();
}
}