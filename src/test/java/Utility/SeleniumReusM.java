package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumReusM
{
	static 	ChromeDriver driver;
	
	//launchBrowser
	public static void launchBrowser(Object[]inputparameters)
	{
		try
		{
		String str1=(String) inputparameters[0];
		String str2=(String) inputparameters[1];
		
		System.setProperty( str1, str2);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
		
	}
	
	//openApplication
	public static void openApplication(Object[]inputparameters)
	{
		try
		{
		String url=(String) inputparameters[0];
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
		
	}
	//moveToElement
	public static void moveToElement(Object[]inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		
		Actions act=new Actions(driver);
		
		WebElement p=driver.findElementByXPath(Xpath);
		
		act.moveToElement(p).build().perform();
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
	}
	
	//same as click below(click on anyElement/Object)
	/*public static void enterUserName(Object[]inputparameters) throws InterruptedException
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement p=driver.findElementByXPath(Xpath);
		
		act.moveToElement(p).build().perform();
		
		p.click();
		
		p.sendKeys("9527253916");
		
		p.sendKeys(Keys.TAB);
		
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
		
	}*/
	
	
	//click
	public static void click(Object[]inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		
		driver.findElementByXPath(Xpath).click();
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
	}
	
	//sendTextOnUI
	
	public static void sendText(Object[] inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		String text=(String) inputparameters[1];
		
		driver.findElementByXPath(Xpath).sendKeys(text);
		}catch(Exception e)
		
		{
			System.out.println("e");
		}
	}	
	
	//dropdownSelect
		public static void select(Object[]inputparameters)
		{
			try
			{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			String Xpath=(String) inputparameters[0];
			
			String name=(String) inputparameters[1];
			
			Select s=new Select(driver.findElementByXPath(Xpath));
			
			s.selectByValue(name);
			}catch(Exception e)
			
			{
				System.out.println("e");
			}
		}
		
	//validateLogin
	
	public static void validateLogin(Object[] inputparameters)
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
		}
		catch(Exception e)
		
		{
			System.out.println("e");
		}
	}
}
