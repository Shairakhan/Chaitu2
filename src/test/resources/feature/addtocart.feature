Feature: As User I want to add item in add to cart
  In order to add to cart
  As a user
  I should Select the item and click on add to cart button

  Scenario: Verify the functionality to add to cart
    Given User navigate to Url "https://demo.nopcommerce.com/"
    Then  User should be navigate to Homepage
    When  User click search for item "Laptop"
    And   User click on search Button
    Then  user should get list of Laptop
    When  User click on add to cart
    Then  User should be able to sucessfully add item into the cart
