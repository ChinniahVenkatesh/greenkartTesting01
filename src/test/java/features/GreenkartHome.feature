Feature: Validating Greenkart Home-Page

@smokeTest
Scenario: Validate the page title

Given Access the url "https://rahulshettyacademy.com/seleniumPractise/"
When Page loads maximize the page
Then Validate the page tile 

@smokeTest
Scenario: Validate the product name

Then Validate the product name

Scenario: Validate the Search Field box placeholder text

When Search field box is enabled
Then validate the search field placeholder text "Search for Vegetables and Fruits"

Scenario: Validate the following keywords in search field box

When Search field box is enabled
Then Enter the <keyword> on search field box
|Tomato|Carrot|Betroot|

Scenario: Validate the List of product in the greenkart home-page

Given User is on greenkart home-page
Then validate the count of the products in page

Scenario: Validate the flight booking link on greenkart home-page

When Flight-booking link is enabled
Then Validate the flight booking link

Scenario Outline: Validate the search field

When User is on search field box 
Then Validate the "<product>" in search field

Examples:
|product|
|Carrot|
|Tomato|
