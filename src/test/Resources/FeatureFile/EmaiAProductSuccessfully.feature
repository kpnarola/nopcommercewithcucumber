Feature: Email a product
  @emailAProduct
  Scenario:To verify registered user should be able to send email with product successfully
    Given Registered user is on the main page of website
    When registered user select product apple mac book from home page
    And navigate to apple macbook product page
    And click on email a friend button to enter all detail with personal message
    Then user should be able to send email with product successfully
