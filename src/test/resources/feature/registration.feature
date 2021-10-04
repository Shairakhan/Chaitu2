Feature  Register as a new user
  In order to register
  As a new user
  I should be enter all the mandatory field
Scenario  Verify registration functionality
  Given User navigate to Url "https://demo.nopcommerce.com/"
  Then  User should be navigate to Homepage
  When  User click on register link
  Then  User should be navigate to Register page
  When  User click on Female radio button
  And   User should Enter Name, lastname ,Email ,address, password, confirm password
  And   User Click on register button
  Then  User should successfully registered

