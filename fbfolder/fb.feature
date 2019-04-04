Feature: Automation of facebook 

Scenario: facebook login page with valid credentials

Given User open chrome browser
When Enter valid username and password
Then Open user account sucessfully
Then logout user account
And close browser
