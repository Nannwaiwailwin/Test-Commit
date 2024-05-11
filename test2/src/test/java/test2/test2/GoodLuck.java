package test2.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoodLuck {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("driver.chrome.driver", "C:\\Users\\Kyaw Wai Hlyan Phyo\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");		
	}
	
	@Test
	public void verify() {
		String atitle=driver.getTitle();
		String exptitle="Google";
		
		Assert.assertEquals(atitle, exptitle);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
