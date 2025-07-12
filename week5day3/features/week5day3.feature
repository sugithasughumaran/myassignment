Feature: Create an Account in the SalesForce 

Scenario: Verifying the Successful Account Creation 
	
	Given the user establishes the portal
	Given the user load the url   
	When the user enter the username  
	When the user enter the password  
	When the user click the login button 
	Then the user navigate to the SalesForce Home page 
	When the user click the App Launcher Icon
	When the user click View All
	Then the user scroll down the page
	When the user click the Accounts
	Then the user click the New Button
	When the user enter the account name
	And the user select the ownership 
	When the user clicks the save button
	Then the user verify the account name
	Then the browser closed



