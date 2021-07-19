Feature: Login functionality of LeafTaps
@functional
Scenario Outline: Login with postive data
Given Enter the username as <username>
And Enter the password as <password>
When Click login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


@smoke
Scenario: Login with nagative data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa123'
When Click login button
But Error message should be displayed

