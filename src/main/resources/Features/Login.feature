@no_close
Feature: Validation for Login Page

  @login_Validation
  Scenario: Login Page
    Given Open Browser and Navigate to URL
    Then Enter username
    Then Enter Password 
    And Click Login Button
    And Verify the error message for invalid cred