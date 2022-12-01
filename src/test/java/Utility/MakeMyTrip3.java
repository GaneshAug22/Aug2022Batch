package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class MakeMyTrip3
	{
		static ChromeDriver driver=null;
		
		public static void browserLaunch(Object[] parameters)
		{
			
			String key=(String) parameters[0];
			String value=(String) parameters[1];
			
			System.setProperty(key,value);
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		public static void openApplication(Object[] parameters)
		{
			
			String url=(String) parameters[0];
			
			driver.get(url);
			
		}
		
		public static void clickOnHotels(Object[] parameters)
		{
			String str=(String)parameters[0];
			
			driver.findElement(By.xpath(str)).click();;
			
		}
		
		public static void clickOnSearchButton(Object[] parameters)
		{
			String str1=(String) parameters[0];
			
			WebElement s=driver.findElementByXPath(str1);
					
			s.click();
			
		}
		
		public static void clickOnSortByPopularity(Object[] parameters)
		{
			String str2=(String) parameters[0];
			
			WebElement p=driver.findElementByXPath(str2);
					
			p.click();
			
		}
		
		public static void clickOnSearchOptions(Object[] parameters)
		{
			String str3=(String) parameters[0];
			
			Actions act=new Actions(driver);
			
			WebElement q=driver.findElementByXPath(str3);
			
			act.moveToElement(q).build().perform();
			
			q.click();
			
		}
		
		public static void 	clickOnText(Object[] parameters)
		{
			String str4=(String) parameters[0];
			
			WebElement q=driver.findElementByXPath(str4);
			
			q.sendKeys("The Sea Horse Resort, Goa");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			q.sendKeys(Keys.ENTER);
			
		}
		
		
		public static void main(String[] args) 
		
		{
			Object[] input=new Object[2];
			
			input[0]="webdriver.chrome.driver";
			input[1]="D:\\Automation Support\\chromedriver.exe";
			
			browserLaunch(input);
				
			Object[] input2=new Object[1];
			
			input2[0]="https://www.makemytrip.com/";
			
			openApplication(input2);
			
			
			Object[] input3=new Object[1];
			
			input3[0]="//*[@href='https://www.makemytrip.com/hotels/']";
			
			clickOnHotels(input3);
			
			
			Object[] input4=new Object[1];
			
			input4[0]="//*[@id='hsw_search_button']";
			
			clickOnSearchButton(input4);
				
			
			Object[] input5=new Object[1];
			
			input5[0]="//*[contains(@class,'customSelectT')]";
			
			clickOnSortByPopularity(input5);
			
			
			Object[] input6=new Object[1];
			
			input6[0]="(//*[@type='text'])[5]";
			
			clickOnText(input6);
			

				
				
				
				
				
				
				
				

}

	}
