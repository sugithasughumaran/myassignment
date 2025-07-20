Feature: Create account in Salesforce

Scenario: User created an account in SalesForce

When the user click the App Launcher
When the user click View All link text
When the user scrolled to Accounts
When the user click Accounts link text
Then the user search unique account name
When the user click dropdown icon next to New Note
Then the user click Edit text link
Then the user Set Type to Technology Partner
Then the user Set Industry to Healthcare
Then the user key in the Billing address to '1123, Jalan Hijayu 3/42, Taman Hijayu 3D'
Then the user key in the Shipping address to '52, Jalan Dato Yusuf Shahbudin 19, Taman Sentosa'
When the user Set Customer priority to Low
Then the user Set SLA Silver
Then the user Set Active to No
When the user enter phone no '53435'
Then the user Set Upsell opportunity to No
When the user click Save button
But verify the Phone number entered
