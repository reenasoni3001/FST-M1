@activity2
Feature: Login Test

  Scenario: testing Login
    Given User is on the Login page
    When User enters username and password
    Then Read the page title and confirmation message
    And Close the browser