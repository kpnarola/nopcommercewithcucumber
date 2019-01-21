Feature: Sort by product
  @sortBy
  Scenario: To verify user should be able to sort by product high to low
    When user click on apparel category from home page
    And click on clothing with sort by price high to low from drop down menu
    And verifying that clothing price sorting high to low
    Then user should be able to sort by price high to low