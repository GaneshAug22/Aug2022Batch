package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReusMcalling
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//launchBrowser
		Object[] input=new Object[2];
		
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\Automation Support\\chromedriver.exe";
		
		SeleniumReusM.launchBrowser(input);
		
		//openApplication
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		SeleniumReusM.openApplication(input1);
		
		//clickOnCancel
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumReusM.click(input2);
		
		//moveToElement
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumReusM.moveToElement(input3);
		
		//clickOnMyProfile
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		SeleniumReusM.click(input4);
		
		//enterUserName
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]="9527253916";
		SeleniumReusM.sendText(input5);
		
		//enterPassword
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="Ganesh@4778";
		SeleniumReusM.sendText(input6);	
		
		
		//clickOnLogin
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumReusM.click(input7);
		

		//clickOnManageAddress
		Object[] input8=new Object[1];
		input8[0]="//*[text()='Manage Addresses']";
		SeleniumReusM.moveToElement(input8);
		SeleniumReusM.click(input8);
		

		//clickOnAddNew
		Object[] input9=new Object[1];
		input9[0]="//*[@class='_1QhEVk']";
		SeleniumReusM.click(input9);
		

		//clickOnName
		Object[] input10=new Object[2];
		input10[0]="//*[@name='name']";
		input10[1]="Ganesh Shinde";
		SeleniumReusM.sendText(input10);
		

		//clickOnMobileNo
		Object[] input11=new Object[2];
		input11[0]="//*[@name='phone']";
		input11[1]="9527253916";
		SeleniumReusM.sendText(input11);
		

		//clickOnPinCode
		Object[] input12=new Object[2];
		input12[0]="//*[@name='pincode']";
		input12[1]="414001";
		SeleniumReusM.sendText(input12);
		

		//clickOnLocality
		Object[] input13=new Object[2];
		input13[0]="//*[@name='addressLine2']";
		input13[1]="Kalyan road";
		SeleniumReusM.sendText(input13);
		

		//clickOnAdd1
		Object[] input14=new Object[2];
		input14[0]="//textarea[@name='addressLine1']";
		input14[1]="Madhav nagar";
		SeleniumReusM.sendText(input14);

		//clickOncity
		Object[] input15=new Object[2];
		input15[0]="//input[@name='city']";
		input15[1]="Ahmadnagar";
		SeleniumReusM.sendText(input15);
		
		//clickOnState
		Object[] input16=new Object[2];
		input16[0]="//*[@name='state']";
		input16[1]="Maharashtra";
		SeleniumReusM.sendText(input16);
		
		//clickOnLandmark
		Object[] input17=new Object[2];
		input17[0]="//*[@name='landmark']";
		input17[1]="Off someshwar lawn";
		SeleniumReusM.sendText(input17);

		//clickOnRadioB
		Object[] input19=new Object[1];
		input19[0]="//label[@for='HOME']//div[@class='_1XFPmK']";
		SeleniumReusM.moveToElement(input19);
		SeleniumReusM.click(input19);
		
		//clickOnSave
		Object[] input20=new Object[1];
		input20[0]="//button[text()='Save']";
		SeleniumReusM.click(input20);
		

		//clickOnConfirm
		Object[] input21=new Object[1];
		input21[0]="//*[text()='Confirm']";
		SeleniumReusM.click(input21);

		
		
	
	}
	
}

