Feature: Login into Application

Scenario Outline: Positive test validating Login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com" Site
And Click on login link in home page to land on secure sign in page
When user enters <username> and <password> and logs in
Then  verify user is successfully logged in
And close browsers

Examples:
|username         |password|
|test99@gmail.com |123456  |
|abc@gmail.com    |123456  |
