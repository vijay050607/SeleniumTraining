Feature: To validate the login functioality of facebook application

Background:
Given To launch the chrome browser and Maximize window


Scenario: To validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser


Examples:
|emaildatas|passworddatas|
|Vijay55@Gmail.com|123456|
|Ajith44@Gmail.com|selenium|
|Surya66@Gmail.com|maven|
|Arun22@Gmail.com|junit|
|Ravi11@Gmail.com|testng|
|Kamal33@Gmail.com|cucumber|