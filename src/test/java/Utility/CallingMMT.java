package Utility;

public class CallingMMT
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//launchBrowser
		Object[] input=new Object[2];
		
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\Automation Support\\chromedriver.exe";
		
		SeleniumOperations .launchBrowser(input);
		
		//openApplication
		Object[] input1=new Object[1];
		input1[0]="https://www.makemytrip.com/";
		
		//moveToElement
		Object[] input3=new Object[1];
		input3[0]="//div[@class='loginModal displayBlock modalLogin dynHeight personal']";
		SeleniumOperations .moveToElement(input3);
		
		//clickOnMyProfile
		Object[] input4=new Object[1];
		input4[0]="//div[@class='loginModal displayBlock modalLogin dynHeight personal']";
		SeleniumOperations.click(input4);
		
	}
	
}
