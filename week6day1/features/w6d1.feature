Feature: create lead with passing value

Scenario Outline: create lead from the portal.

Then the user click Account tab
Then the uesr click the Create Account
When the user fill in the Account Name <fname>
When the user fill in the Description <desc>
When the user fill in the Email Address <email address>
When the user fill in the Phone Number <Phone>
Then the user click the Create Account button

Examples:
|Account Name | Description | Email Address | Phone Number |
|Sugitha | Continue Learning | githa@gmail.com | 97899 |
|Tarun | TSK | tima@gmail.com | |
|Vimala | HSC | vima@yahoo.com | 98789 |
|Sham | HHS | sham@hotmail.com | 89899 |



