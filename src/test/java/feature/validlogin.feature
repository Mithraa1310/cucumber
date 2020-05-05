Feature: Leaftaps Login 

Background: 
Given Launch the chrome browser
And Load the url next
And Set the timeout
And Maximize the window

Scenario Outline: Login with valid credentials


Given Enter the usrname as <username>
And Enter the pasword as <password>
When Click the Login button
Then Verify Homepage is displayed


Examples:
|username|password|
|demosalesmanager|crmsfa|
|democsr|crmsfa|

Scenario Outline: Login with invalid credentials


Given Enter the usrname as <user>
And Enter the pasword as <pass>
When Click the Login button
Then Verify error message


Examples:
|user|pass|
|demosales|crmsfa|
|democsr|crmsfa123|





