package module;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testing.Base;
import testing.Home;

public class HomeTest extends Base{
	
	

	public HomeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled=false)
	public void tc1() throws IOException
	{
	 Home obj = new Home();
	 obj.toFindFormTitle(dr);
		
	}
	
	@Test(enabled=false)
	public void toClickPartial() throws IOException
	{
	 Home obj = new Home();
	 obj.toClickOnPartialText(dr);
		
	}
	

	@Test(enabled=false)
	public void toLink() throws IOException
	{
	 Home obj = new Home();
	 obj.toClickOnLinkText(dr);
		
	}
	
	@Test(enabled=false)
	public void toEnterUser() throws IOException
	{
	 Home obj = new Home();
	 obj.toEnterName(dr);
		
	}
	
	@Test(enabled=false)
	public void toEnterMaleFemale() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.toclickMaleFemale(dr);
		
	}
	
	@Test(enabled=false)
	public void toEnterPracticeForm() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.toclickYearOfExperience(dr);
	 obj.toenterDate(dr);
	 obj.toclickProfession(dr);
	 obj.tochooseFile(dr);
	 obj.toselectContinent(dr);
	 obj.toselectSeleniumCommands(dr);
	 obj.toClickButton(dr);
	 
	}
	
	@Test(enabled=false)
	public void togetWebTable() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.toClickOnLinkText(dr);
	 obj.toSelectSummaryTable(dr);
	}
	
	@Test(enabled=false)
	public void toMouseHoverOnTutorial() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.toHoverTutorial(dr);
	
	}
	
	
	@Test(enabled=false)
	public void validateSupportEmail() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.toValidateSupportEmail(dr);
	
	}
	
	@Test(enabled=false)
	public void toverifyBasicJava() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.basicJava(dr);
	
	}
	
	@Test(enabled=true)
	public void toverifyPrimaryMenuWithoutChild() throws IOException, InterruptedException
	{
	 Home obj = new Home();
	 obj.verifyPrimaryMenuWithoutChild(dr);
	
	}
	

}
