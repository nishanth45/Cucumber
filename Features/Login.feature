Feature: Login Functionality Feature

Scenario: Login Functionality
Given user navigates to Pega Website
When user logs in using Username as "1234"
And password as "1234"
Then login should be successful
And Home page should be displayed



