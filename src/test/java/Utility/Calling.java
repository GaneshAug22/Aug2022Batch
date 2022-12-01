package Utility;

public class Calling 
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
		input1[0]="https://www.flipkart.com/";
		SeleniumOperations .openApplication(input1);
		
		//clickOnCancel
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations .click(input2);
		
		//moveToElement
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations .moveToElement(input3);
		
		//clickOnMyProfile
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		SeleniumOperations.click(input4);
		
		//enterUserName
		Object[] input5=new Object[1];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		SeleniumOperations.sendText(input5);
		
		//enterPassword
		Object[] input6=new Object[1];
		input6[0]="//*[@type='password']";
		SeleniumOperations.sendText(input6);	
		
		
		//clickOnLogin
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.click(input7);
		

		//clickOnManageAddress
		Object[] input8=new Object[1];
		input8[0]="(//*[@class='NS64GK'])[1]";
		SeleniumOperations.click(input8);
		

		//clickOnAddNew
		Object[] input9=new Object[1];
		input9[0]="//*[@class='_1QhEVk']";
		SeleniumOperations.click(input9);
		

		//clickOnName
		Object[] input10=new Object[2];
		input10[0]="//*[@name='name']";
		input10[1]="Rohit";
		SeleniumOperations.sendText(input10);
		

		//clickOnMobileNo
		Object[] input11=new Object[2];
		input11[0]="//*[@name='phone']";
		input11[1]="9527253916";
		SeleniumOperations.sendText(input11);
		

		//clickOnPinCode
		Object[] input12=new Object[2];
		input12[0]="//*[@name='pincode']";
		input12[1]="413711";
		SeleniumOperations.click(input12);
		

		//clickOnLocality
		Object[] input13=new Object[2];
		input13[0]="//*[@name='addressLine2']";
		input13[1]="Rahuri";
		SeleniumOperations.click(input13);
		

		//clickOnAdd
		Object[] input14=new Object[2];
		input14[0]="//*[@name='addressLine1']";
		input14[0]="Dhanore,Rahuri";
		SeleniumOperations.click(input14);
		

		//clickOncity
		Object[] input15=new Object[2];
		input15[0]="//*[@name='city']";
		input15[1]="Nagar";
		SeleniumOperations.click(input15);
		

		//clickOnState
		Object[] input16=new Object[2];
		input16[0]="//*[@name='state']";
		input16[1]="Maharashtra";
		SeleniumOperations.click(input16);
		
		//clickOnLandmark
		Object[] input17=new Object[2];
		input17[0]="//*[@name='landmark']";
		input17[1]="Near Biroba Temple";
		SeleniumOperations.click(input17);

		//clickOnRadioB
		Object[] input19=new Object[1];
		input19[0]="(//*[@type='button'])[2]";
		SeleniumOperations.click(input19);
		

		//clickOnSave
		Object[] input20=new Object[1];
		input20[0]="//*[text()='Save']";
		SeleniumOperations.click(input20);
		

		//clickOnSave
		Object[] input21=new Object[1];
		input21[0]="//*[text()='Confirm']";
		SeleniumOperations.click(input21);
		
		
	
	}
	
}
