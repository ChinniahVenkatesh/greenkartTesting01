Feature: Testing Home_page of Cricinfo

Background:
Given Access the Espncricinfo url "https://www.espncricinfo.com"

@RegTest
Scenario: Test the Alert pop-up

When User is on home-page maximize the page
Then validate the alert pop-up

@smokeTest
Scenario: Test the page-title

Then validate the page-title


