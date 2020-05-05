Feature: CreateLead for LeafTaps

Scenario Outline: verify the creation of new lead

Given Launch the browser
And Load the url
And Set the timeouts
And Maximize the browser
And Enter the username as <username>
And Enter the password as <password>
And Click on the Login button
And Click CRMSFA Link
And Click Leads
And Click createLead
And Enter Company Name as <cname>
And Enter first Name as <fname>
And Enter last Name as <lname>
When clicking on Create Lead button
Then Verify view Lead is displayed


Examples:
|username|password|cname|fname|lname|
|demosalesmanager|crmsfa|TCS|Saranya|Dharanidharan|
|democsr|crmsfa|Infosys|Sunitha|Ajith|
|democsr2|crmsfa|CTS|Usha|Mahendran|