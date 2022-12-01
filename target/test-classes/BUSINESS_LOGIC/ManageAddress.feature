Feature: Manage address functionality

Background: User successfully clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page
When user navigate on Login
When user Click on My Profile
When user enter "9527253916" as username
When user enter "Ganesh@4778" as password
When user click on Login button


Scenario: User successflly added new address
When User click on Manage address
When User click on Add new address
When User enter "Rohit" as name
When user enter "9527253916" as mobile number
When User enter "413711" as pincode
When User enter "Rahuri" as locality
When User enter "Dhanore,Rahuri" as address
When User enter "Ahmednagar" as city
When User enter "Maharashtra" as state
When User enter "Near Biroba Temple" as landmark
When User click on Radio button
When User click on save button
Then application shows new address profile to user
