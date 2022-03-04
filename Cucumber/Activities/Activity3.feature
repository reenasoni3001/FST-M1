@activity3

Feature: Tags Test Activity

  @SmokeTest @SimpleAlert
  Scenario: Testing with Simple Alert
    Given User is on Alert page
    When User clicks the Simple Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert
    And Read the result text
    And Close browser

  @ConfirmAlert
  Scenario: Testing with Confirm Alert
    Given User is on Alert page
    When User clicks the Confirm Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert with Cancel
    And Read the result text
    And Close browser

  @PromptAlert
  Scenario: Testing with Prompt Alert
    Given User is on Alert page
    When User clicks the Prompt Alert button
    Then Alert opens
    And Read the text from it and print it
    And Write a custom message in it
    And Close the alert
    And Read the result text
    And Close browser