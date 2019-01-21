Feature: Registration

  As a User I wanted to Register successfully on https://demo.nopcommerce.com
  so I can buy any product, I can email any product to friend and filter the product price high to low

  @registration
  Scenario: To verify user should be able to register successfully
    Given user is on the registration page
    When user enter all the personal detail and click on Register button
    Then user should be able to register successfully