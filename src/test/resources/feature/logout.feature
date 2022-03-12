Feature: Verify the login Functionality
  In order to login
  As a User
  I should provide valid Credential

  Scenario: Verify login functionality with valid credential
    Given User should navigate to Url "https://demo.nopcommerce.com/"
    Then  User should navigate to Homepage
    When  User Click on login link
    Then  User should be navigate to Login page
    When  User Enter Username
    And   user Enter Password
    And   User click on logout button
    Then  User should be successful login
