package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Home {
	
	Properties prop = new Properties();
	public Home() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\jaipr\\OneDrive\\Desktop\\Tutorial\\Tutorial\\TestProject1\\FrameworkDesign\\src\\main\\resources\\resourcePackage\\locators.properties"));
	    prop.load(fis);
	}
	
	public void toFindFormTitle(WebDriver dr)
	{
		String formTitleLoc = prop.getProperty("formTitle");
		String formTitle=dr.findElement(By.xpath(formTitleLoc)).getText();
		
		System.out.println("form"+formTitleLoc);
		Assert.assertEquals(formTitle, "Practice Automation Form");
	}
	
	public void toClickOnPartialText(WebDriver dr)
	{
		String partialloc = prop.getProperty("partialLinkText");
		
		dr.findElement(By.xpath(partialloc)).click();
	}
	
	public void toClickOnLinkText(WebDriver dr)
	{
		String Linkloc = prop.getProperty("linkText");
		
		dr.findElement(By.xpath(Linkloc)).click();
	}
	
	public void toEnterName(WebDriver dr)
	{
		String fname=prop.getProperty("firstName");
		String lname=prop.getProperty("lastName");
		dr.findElement(By.xpath(fname)).sendKeys("admin");
		dr.findElement(By.xpath(lname)).sendKeys("admin");
	}
	
	public void toclickMaleFemale(WebDriver dr) throws InterruptedException
	{
		String maleFemale=prop.getProperty("maleFemale");
	    List<WebElement> list = dr.findElements(By.xpath(maleFemale));
	  //  for(WebElement e:list)
	    for(int i=0;i<list.size();i++)
	    {
	    	list.get(i).click();
	       	Thread.sleep(5000);
	    }
		
	}
	
	
	public void toclickYearOfExperience(WebDriver dr) throws InterruptedException
	{
		String yearOfExperience=prop.getProperty("yearOfExperience");
	    List<WebElement> listyear = dr.findElements(By.xpath(yearOfExperience));
	  //  for(WebElement e:list)
	    for(int i=0;i<listyear.size();i++)
	    {
	    	listyear.get(i).click();
	       	Thread.sleep(5000);
	    }
		
	}
	
	public void toenterDate(WebDriver dr) throws InterruptedException
	{
		String dateForm=prop.getProperty("dateForm");
	   WebElement ele = dr.findElement(By.xpath(dateForm));
	   ele.sendKeys("12122019");
		
	}
	
	public void toclickProfession(WebDriver dr) throws InterruptedException
	{
		String profession=prop.getProperty("profession");
	    List<WebElement> listprofession = dr.findElements(By.xpath(profession));
	  
	    for(int i=0;i<listprofession.size();i++)
	    {
	    	listprofession.get(i).click();
	       	Thread.sleep(5000);
	    }
		
	}
	
	
	public void tochooseFile(WebDriver dr) throws InterruptedException
	{
		String chooseFile=prop.getProperty("photoForm");
	   WebElement photoForm = dr.findElement(By.xpath(chooseFile));
	   photoForm.sendKeys("C:\\Users\\jaipr\\OneDrive\\Documents\\tulip.jpg");
		
	}
	
	public void toselectContinent(WebDriver dr) throws InterruptedException
	{
		String continents=prop.getProperty("continents");
		Select selWebElement = new Select(dr.findElement(By.xpath(continents)));
		selWebElement.selectByIndex(0);
		
	}
	
	public void toselectSeleniumCommands(WebDriver dr) throws InterruptedException
	{
		String selectSeleniumCommands=prop.getProperty("seleniumCommands");
				
		Select seleniumComm = new Select(dr.findElement(By.xpath(selectSeleniumCommands)));
		seleniumComm.selectByIndex(3);
	}	
	
	public void toClickButton(WebDriver dr)
	{
		String button = prop.getProperty("button");
		
		dr.findElement(By.xpath(button)).click();
	}
	

	public void toSelectSummaryTable(WebDriver dr)
	{
		String sampleTab = prop.getProperty("sampleTable");
		
		WebElement htmlTable= dr.findElement(By.xpath(sampleTab));
		
		List <WebElement> rows = htmlTable.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List <WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<columns.size();j++)
			{
				
				
				if(columns.get(j).getText().equals("details"))
				{
					String txt =columns.get(j).getText();
					System.out.println( txt);
				}
			}
		}
	}
	

}
