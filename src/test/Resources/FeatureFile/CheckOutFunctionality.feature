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

  @termsAndCondition
  Scenario: to verify user must have to accept terms and condition for check out
    Given user is on home page of website
    When user click on register button from homepage
    And user enter all the personal detail and click on Register button
    And click on register continue button
    And  select product build your own computer from home page
    And  navigate to build your own computer product page
    And add product to basket and proceed checkout without accepting terms and condition
    Then user should not be able to buy that product successfully