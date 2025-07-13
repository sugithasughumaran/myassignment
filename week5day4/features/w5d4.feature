Feature: Successfully login and create lead LeafTaps

Scenario: Create Lead

When the user click on Account tab
And the user click on Create Account link
Then Create Account page is loaded
When the user fill in the Account name
And the user fill in the description
And the user fill in the employee number
And the user fill in the office site name
Then the user click save button
And verify the new Lead is created

Scenario: Verify unable to submit the particular without entering the mandatory field.

When the user click on Account tab
And the user click on Create Account link
Then Create Account page is loaded
When the user fill in the employee number
Then the user click save button
But verify unable to save
And Error message is available