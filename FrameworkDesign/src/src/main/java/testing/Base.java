package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	
	public static WebDriver dr;
	Properties constProp = new Properties();
	String browser;
	String url;
	
	public Base() throws IOException
	{
		FileInputStream constFis = new FileInputStream(new File("C:\\Users\\jaipr\\OneDrive\\Desktop\\Tutorial\\Tutorial\\TestProject1\\FrameworkDesign\\src\\main\\resources\\resourcePackage\\constants.properties"));
	   constProp.load(constFis);
	}
	
	

	@BeforeMethod
	public void befmet()
	{
	
		browser=constProp.getProperty("browser");
		url=constProp.getProperty("host");
		if(browser.equalsIgnoreCase("chrome")) {
		//	System.out.println("i am in chrome");
		System.setProperty("webdriver.chrome.driver","D:\\software\\latest\\chromedriver.exe");
		dr=new ChromeDriver();
	}else
	{
		//System.out.println("i am in IE");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\jaipr\\Downloads\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
		dr = new InternetExplorerDriver();
	}
		
		//dr.get("https://www.toolsqa.com/automation-practice-form/");
		dr.get(url);
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
