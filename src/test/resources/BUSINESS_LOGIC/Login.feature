Feature: Login functionality

Background: User successfully clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page

@SmokeTest
Scenario Outline: Login functionality with invalid username and valid password
When user navigate on Login
When user Click on My Profile
When user enter <username> as username
When user enter <password> as password
When user click on Login button
Then application shows appropriate error message


Examples:
				| username  |   password  |
				|  ganesh   |   abc@123   |  	 
				| 9527253916| Ganesh@4778 |	
			
