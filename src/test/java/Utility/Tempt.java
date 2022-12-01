package Utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//launchBrowser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait
			
			//openApplication
			driver.get("https://www.flipkart.com/");
			
			//clickOnCancel
			WebElement abc=driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']");
			
			abc.click();
			
			//moveToElement
			Actions act=new Actions(driver);
			
			WebElement e=driver.findElementByXPath("//*[@class='_1_3w1N']");
			
			act.moveToElement(e).build().perform();
			
			//clickonMyProfile
			driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
			
			//enterUserName
			WebElement p=driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']");
			
			act.moveToElement(p).build().perform();
			
			p.sendKeys("9527253916");
			
			p.sendKeys(Keys.TAB);
			
			//enetrPassword
			WebElement t=driver.findElementByXPath("//*[@type='password']");
			
			act.moveToElement(t).build().perform();
			
			t.sendKeys("Ganesh@4778");
			
			//clickOnLoginButton
			driver.findElementByXPath("(//*[@type='submit'])[2]").click();
			
			Thread.sleep(5000);
			
			WebElement m=driver.findElement(By.xpath("//*[text()='Manage Addresses']"));
			
			//act.moveToElement(m).build().perform();
			
			m.click();
			
			driver.findElementByClassName("_1QhEVk").click();
			driver.findElementByXPath("//*[@name='name']").sendKeys("Rohit");
			driver.findElementByXPath("//*[@name='phone']").sendKeys("9527253916");
			driver.findElementByXPath("//*[@name='pincode']").sendKeys("413711");
			driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Rahuri");
			driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Dhanore,Rahuri");
			driver.findElementByXPath("//*[@name='city']").sendKeys("Ahmednagar");
			
			Select state=new Select(driver.findElementByXPath("//*[@name='state']"));
			
			state.selectByValue("Maharashtra");
			
			driver.findElementByXPath("//*[@name='landmark']").sendKeys("Near Biroba Temple");
			driver.findElementByXPath("//*[@class='_1XFPmK']").click();
			driver.findElementByXPath("(//*[@type='button'])[2]").click();
	
			driver.findElementByXPath("//*[text()='Confirm']").click();
			
			
			
			
	}
	
}
