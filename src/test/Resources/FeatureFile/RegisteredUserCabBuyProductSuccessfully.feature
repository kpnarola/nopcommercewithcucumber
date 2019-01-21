Feature: BuyProduct
  Scenario: To verify registered user should be able to buy any single product successfully
    Given Registered user is on the main page of website
    When user select hct one m8 android l 5.0 lollipop product from home page
    And add product in basket and accept terms and condition
    And click on  check out button
    And proceed check out with required detail
    Then registered user should be able to buy any product successfully