Feature: Create an user from Account

Scenario Outline:

When the user click the App Launcher
Then the user click View All text link
Then the user click Sale icon
When the sales page is loaded 
Then the user click Account dropdown button
Then the user selected New Account
When the New account page is loaded 
Then the user enter Account name <aname>
Then the user Select <ownership>
And the user click Save button
Then the user verify the newly created <aname>

Examples:

|aname       | ownership |
|Test user1  | Public    |
|Ram         | Private   |
|Thanu       | Public    |
|Luna        | Private   |