package cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.chrome.ChromeDriver;

import Utility.HTMLReportGenerator;
import Utility.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	public ChromeDriver driver;
@When("^user provide \"([^\"]*)\" and exe location as \"([^\"]*)\"$")
public void bLaunch(String key, String exe) 
{
	//launchBrowser
	Object[] input=new Object[2];
			
	input[0]="webdriver.chrome.driver";
	input[1]="D:\\Automation Support\\chromedriver.exe";
			
	Hashtable<String,Object> output3=	SeleniumOperations .launchBrowser(input);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user provide \"([^\"]*)\" and exe location as \"([^\"]*)\"$", output3.get("MESSAGE").toString());
	
}

@When("^user provide url as \"([^\"]*)\"$")
public void openApp(String url) 
{

	//openApplication
	Object[] input1=new Object[1];
	input1[0]="https://www.flipkart.com/";
	
	Hashtable<String,Object> output3=SeleniumOperations .openApplication(input1);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user provide url as \"([^\"]*)\"$", output3.get("MESSAGE").toString());
	
}

@When("^user cancel initial login page$")
public void cancel() 
{

	//clickOnCancel
	Object[] input2=new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	
	Hashtable<String,Object> output3=	SeleniumOperations .click(input2);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user cancel initial login page$", output3.get("MESSAGE").toString());
	
}

@When("^user navigate on Login$")
public void login() 
{
	//moveToElement
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_1_3w1N']";
	
	Hashtable<String,Object> output3=	SeleniumOperations .moveToElement(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user navigate on Login$", output3.get("MESSAGE").toString());
}

@When("^user Click on My Profile$")
public void myProfile() 
{
	//clickOnMyProfile
	Object[] input4=new Object[1];
	input4[0]="(//*[@class='_3vhnxf'])[1]";
	
	Hashtable<String,Object> output3=	SeleniumOperations.click(input4);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user Click on My Profile$", output3.get("MESSAGE").toString());
}

@When("^user enter (.+) as username$")
public void username(String name) 
{
	//enterUserName
	Object[] input5=new Object[2];
	input5[0]="//*[@class='_2IX_2- VJZDxU']";
	input5[1]= name;
	
	Hashtable<String,Object> output3=	SeleniumOperations.sendText(input5);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter (.+) as username$", output3.get("MESSAGE").toString());
}

@When("^user enter (.+) as password$")
public void password(String pass) 
{
	//enterPassword
	Object[] input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]=pass;
	
	Hashtable<String,Object> output3=	SeleniumOperations.sendText(input6);	
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter (.+) as password$", output3.get("MESSAGE").toString());
}

@When("^user click on Login button$")
public void loginButton() 
{
	//clickOnLogin
	Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";

	Hashtable<String,Object> output3=	SeleniumOperations.click(input7);	
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user click on Login button$", output3.get("MESSAGE").toString());
	
}


@Then("^application shows appropriate error message$")
public void apprErrMessage() 
{
	Object[] input8=new Object[1];
	input8[0]="https://www.flipkart.com/account/?rd=0&link=home_account";
	
	Hashtable<String,Object> output3=	SeleniumOperations.validateLogin(input8);
	
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^application shows appropriate error message$", output3.get("MESSAGE").toString());
	
}



}

