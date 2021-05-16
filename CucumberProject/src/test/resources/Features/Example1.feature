Feature: Test Login Functionality

Scenario Outline: Check login is successful with valid credentials
Given browser is open now
And User is on login page 
When user enters valid <username> and <password>
And hits login button
Then user is navigated to the next action page

Examples:

|username|password|
|raghav|12345|
|sullu|12345|
|paddu|12345|