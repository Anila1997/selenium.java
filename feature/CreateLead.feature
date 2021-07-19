Feature: Create Lead in LeafTaps application


@regression @functional
Scenario: Create lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
When Click on 'Leads' link
When Click on 'Create Lead' link




