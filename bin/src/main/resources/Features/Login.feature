@no_close
Feature: Validation for Login Page

  @login_Validation
  Scenario: Login Page
    Given Open Browser and Navigate to URL
    Then Enter username "Admin"
    Then Enter Password "admin123"
    And Click Login Button
    And Verify the error message for invalid cred