package Utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations
{
	public static ChromeDriver driver;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//launchBrowser
	public static Hashtable<String,Object> launchBrowser(Object[] inputparameters)
	{
		try
		{
		String str1=(String) inputparameters[0];
		String str2=(String) inputparameters[1];
		
		System.setProperty( str1, str2);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:launchBrowser, InputGiven: " + inputparameters[0].toString());
		
		}catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:launchBrowser, InputGiven: " + inputparameters[0].toString());
		}
		
		return outputParameters;
	}
	
	//openApplication
	public static Hashtable<String,Object> openApplication(Object[]inputparameters)
	{
		try
		{
		String url=(String) inputparameters[0];
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:openApplication, InputGiven: " + inputparameters[0].toString());
		
		}catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:openApplication, InputGiven: " + inputparameters[0].toString());
		}
		return outputParameters;
	}
	//moveToElement
	public static Hashtable<String,Object> moveToElement(Object[]inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		
		Actions act=new Actions(driver);
		
		WebElement p=driver.findElementByXPath(Xpath);
		
		act.moveToElement(p).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:moveToElement, InputGiven: " + inputparameters[0].toString());
		
		}catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:moveToElement, InputGiven: " + inputparameters[0].toString());
		}
		return outputParameters;
	}
	
	//click
	public static Hashtable<String,Object> click(Object[]inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		
		driver.findElementByXPath(Xpath).click();

		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:click, InputGiven: " + inputparameters[0].toString());
		
		}catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:click, InputGiven: " + inputparameters[0].toString());
		}
		return outputParameters;
	}
	
	//sendTextOnUI
	
	public static Hashtable<String,Object> sendText(Object[] inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		String text=(String) inputparameters[1];
		
		driver.findElementByXPath(Xpath).sendKeys(text);

		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:sendText, InputGiven: " + inputparameters[1].toString());
		
		}catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:sendText, InputGiven: " + inputparameters[0].toString());
			
		}
		return outputParameters;
	}	
	
	//dropdownSelect
		public static Hashtable<String,Object> select(Object[]inputparameters)
		{
			try
			{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			String Xpath=(String) inputparameters[0];
			
			String name=(String) inputparameters[1];
			
			Select s=new Select(driver.findElementByXPath(Xpath));
			
			s.selectByValue(name);

			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodused:select, InputGiven: " + inputparameters[0].toString());
			
			}catch(Exception e)
			
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodused:select, InputGiven: " + inputparameters[0].toString());
			
			}
			return outputParameters;
		}
		
	//validateLogin
	
	public static Hashtable<String,Object> validateLogin(Object[] inputparameters)
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String requrl=(String) inputparameters[0];
		
		String acturl=driver.getCurrentUrl();
		
		if(acturl.equalsIgnoreCase(requrl))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}

		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodused:validateLogin, InputGiven: " + inputparameters[0].toString());
		
		}
		catch(Exception e)
		
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodused:validateLogin, InputGiven: " + inputparameters[0].toString());
		}
		return outputParameters;
	}
}
