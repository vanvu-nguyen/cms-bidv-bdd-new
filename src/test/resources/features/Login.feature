@AdminLogin
Feature: Admin Login

  @AdminLoginWithValidCredentials
  Scenario: Successful login with valid credentials
    Given the admin is on the login page
    When the admin switches language to English
    When the admin enters valid username
    When the admin enters valid password
    When the admin click to login button
    Then the admin should be redirected to the dashboard page

  @AdminLoginWithInvalidCredentials
  Scenario: Unsuccessful login with invalid username
    Given the admin is on the login page
    When the admin switches language to English
    When the admin enters invalid username
    When the admin enters valid password
    When the admin click to login button
    Then the invalid credentials error message displayed






