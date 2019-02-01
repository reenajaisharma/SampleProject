package testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	
	public static WebDriver dr;
	
	@BeforeMethod
	public void befmet()
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\latest\\chromedriver.exe");
		dr=new ChromeDriver();
		
		dr.get("https://www.toolsqa.com/automation-practice-form/");
		dr.manage().window().maximize();
		//dr.manage().window().setSize(new Dimension(1000,1000));
	}
	@AfterMethod
	public void aftmet()
	{
		//dr.close();
		//dr.quit();
	}

}
