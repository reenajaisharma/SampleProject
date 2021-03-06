package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	
	public void toHoverTutorial(WebDriver dr)
	{
		String tutorialMenu = prop.getProperty("tutorialMenu");
		
		//Actions class for MouseHover functionality
		
		Actions action=new Actions(dr);
		action.moveToElement(dr.findElement(By.xpath(prop.getProperty("tutorialMenu")))).build().perform();
		WebElement ele = dr.findElement(By.xpath(prop.getProperty("softwareTestingTutorial")));
		ele.click();
	}
	
	public void toHoverOnTools(WebDriver dr)
	{
	
		
		//Actions class for MouseHover functionality
		
		Actions action=new Actions(dr);
		action.moveToElement(dr.findElement(By.xpath(prop.getProperty("tools")))).build().perform();
		WebElement subMenuUIAutomation = dr.findElement(By.xpath(prop.getProperty("uiAutomation")));
		subMenuUIAutomation.click();
		//action.moveToElement(dr.findElement(By.xpath(prop.getProperty("uiAutomation")))).build().perform();
		WebElement ele = dr.findElement(By.xpath(prop.getProperty("seleniumTutorial")));
		ele.click();
	}
	
	public void verifyBasicJava(WebDriver dr) throws InterruptedException
	{
	    
		List<WebElement> basicJava = dr.findElements(By.xpath(prop.getProperty("basicJavaTutorial")));
		//for(WebElement ele:basicJava)
		System.out.println(basicJava.size());
		for(int i=0;i<basicJava.size();i++)
		{
			System.out.println(basicJava.get(i).getText());
			basicJava.get(i).click();
			Thread.sleep(3000);
			dr.navigate().back();
			basicJava = dr.findElements(By.xpath(prop.getProperty("basicJavaTutorial")));
		}
	}
	
	public void verifyPrimaryMenuWithoutChild(WebDriver dr) throws InterruptedException
	{
		List<WebElement> priMenuWithnochild = dr.findElements(By.xpath(prop.getProperty("primaryMenuWithoutChildren")));
		
		for(int i=0;i<priMenuWithnochild.size();i++)
		{
			//to getText of the menu
			System.out.println(priMenuWithnochild.get(i).getText());
			switch(i) {
			
			case 0:
				priMenuWithnochild.get(i).click();
				
				//apply wait for 3 sec
				Thread.sleep(3000);
				
				//navigate back
				dr.navigate().back();
				
				i++;
				//define list to avoid stale exception
				priMenuWithnochild = dr.findElements(By.xpath(prop.getProperty("primaryMenuWithoutChildren")));
				//continue;
			case 1:
				Actions action = new Actions(dr);
				System.out.println(priMenuWithnochild.get(i));
				action.moveToElement(priMenuWithnochild.get(i)).build().perform();
				//priMenuWithnochild = dr.findElements(By.xpath(prop.getProperty("primaryMenuWithoutChildren")));
				break;
			default:
					break;
			}
			/*
			if(priMenuWithnochild.get(i).getText().equalsIgnoreCase("HOME")) {
				priMenuWithnochild.get(i).click();
				
				//apply wait for 3 sec
				Thread.sleep(3000);
				
				//navigate back
				dr.navigate().back();
				//define list to avoid stale exception
				priMenuWithnochild = dr.findElements(By.xpath(prop.getProperty("primaryMenuWithoutChildren")));
				continue;
			}
			
			else if(priMenuWithnochild.get(i).getText().equalsIgnoreCase("DEMO SITES"))
			{
				Actions action = new Actions(dr);
				action.moveToElement(priMenuWithnochild.get(i)).build().perform();
				priMenuWithnochild = dr.findElements(By.xpath(prop.getProperty("primaryMenuWithoutChildren")));
			}
			*/
					
		}
	}
	
	
	
	public void toValidateSupportEmail(WebDriver dr) throws InterruptedException
	{
		String supprtEmail = prop.getProperty("supprtEmail");
		Thread.sleep(5000);
		
		String str=dr.findElement(By.xpath(supprtEmail)).getText();
		
		//String str="support@toolsqa.com";
		
		//support@toolsqa.com
		//String pattern = "[a-zA-Z]+";
		String pattern="([a-zA-Z]+)@([a-zA-Z]+)\\.([a-zA-Z]+)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.print(m.group());
		}
		
		// String s = "humbapumpa jim";
	     //   Assert.assertTrue(s.matches(".*(jim|joe).*"));
		System.out.println("pattern  :" + pattern);
		
		   Assert.assertTrue(str.matches(pattern));
	}
	
	public void basicJava(WebDriver dr) throws InterruptedException
	{
		toHoverOnTools(dr);
		verifyBasicJava(dr);
	}

}
