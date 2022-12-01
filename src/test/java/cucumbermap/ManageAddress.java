package cucumbermap;

import Utility.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageAddress
{

@When("^User click on Manage address$")
public void manageAddress() throws InterruptedException 
{

	//clickOnManageAddress
	Object[] input8=new Object[1];
	input8[0]="(//*[@class='NS64GK'])[1]";
	SeleniumOperations.click(input8);
	
}

@When("^User click on Add new address$")
public void newAddress() 
{

	//clickOnAddNew
	Object[] input9=new Object[1];
	input9[0]="//*[@class='_1QhEVk']";
	SeleniumOperations.click(input9);
	
}

@When("^User enter \"([^\"]*)\" as name$")
public void name(String arg1) 
{

	//clickOnName
	Object[] input10=new Object[1];
	input10[0]="//*[@name='name']";
	SeleniumOperations.click(input10);
	
}

@When("^user enter \"([^\"]*)\" as mobile number$")
public void mobilenumber(String arg1) 
{

	//clickOnMobileNo
	Object[] input11=new Object[1];
	input11[0]="//*[@name='phone']";
	SeleniumOperations.click(input11);
	
}

@When("^User enter \"([^\"]*)\" as pincode$")
public void pincode(String arg1) 
{

	//clickOnPinCode
	Object[] input12=new Object[1];
	input12[0]="//*[@name='pincode']";
	SeleniumOperations.click(input12);
	
}

@When("^User enter \"([^\"]*)\" as locality$")
public void locality(String arg1) 
{

	//clickOnLocality
	Object[] input13=new Object[1];
	input13[0]="//*[@name='addressLine2']";
	SeleniumOperations.click(input13);
	
}

@When("^User enter \"([^\"]*)\" as address$")
public void address(String arg1) 
{
	//clickOnAdd
	Object[] input14=new Object[1];
	input14[0]="//*[@name='addressLine1']";
	SeleniumOperations.click(input14);
	
	
}

@When("^User enter \"([^\"]*)\" as city$")
public void City(String arg1) 
{

	//clickOncity
	Object[] input15=new Object[1];
	input15[0]="//*[@name='city']";
	SeleniumOperations.click(input15);
	
}

@When("^User enter \"([^\"]*)\" as state$")
public void state(String arg1) 
{

	//clickOnState
	Object[] input16=new Object[1];
	input16[0]="//*[@name='state']";
	SeleniumOperations.click(input16);
	
}

@When("^User enter \"([^\"]*)\" as landmark$")
public void landmark(String arg1) 
{

	//clickOnLandmark
	Object[] input17=new Object[1];
	input17[0]="//*[@name='landmark']";
	SeleniumOperations.click(input17);
	
}

@When("^User click on Radio button$")
public void radioButton() 
{
	
	//clickOnRadioB
	Object[] input19=new Object[1];
	input19[0]="(//*[@type='button'])[2]";
	SeleniumOperations.click(input19);
}

@When("^User click on save button$")
public void saveButton() 
{
	//clickOnSave
			Object[] input20=new Object[1];
			input20[0]="//*[text()='Save']";
			SeleniumOperations.click(input20);
	
}

@Then("^application shows new address profile to user$")
public void newAddressPro() 
{

	//clickOnSave
	Object[] input21=new Object[1];
	input21[0]="//*[text()='Confirm']";
	SeleniumOperations.click(input21);
	
}

}