Feature: BuyProduct
  @buyProduct
  Scenario: To verify registered user should be able to buy any single product successfully
    Given user is on the main page of website
    When user proceed registration successfully
    And click on register continue button
    And select hct one m android lollipop product from home page
    And navigate to product page
    And add product in basket and accept terms and condition
    And click on  check out button
    And proceed check out with required detail
    Then registered user should be able to buy any product successfully