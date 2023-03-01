Feature: Test CONTACT

  Scenario: Verify Contact Page is displayed
    Given when user on home page and click on Contact
    When user Enter Name and Email and Message
    Then Click on submit
    And Verify form submitted successfully


