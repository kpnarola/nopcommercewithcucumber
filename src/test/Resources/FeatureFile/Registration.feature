Feature: Registration

  As a User I wanted to Register successfully on https://demo.nopcommerce.com
  so I can buy any product, I can email any product to friend and filter the product price high to low

  Scenario: To verify user should be able to register successfully
    Given User is on the registration page
    When user select gender "Male"
    And enter the first name "Kp"
    And enter the last name "patel"
    And select the day, month and year for the date of birth "6 april 1979"
    And enter email address "kppatel@yahoo.com"
    And enter company name "Yogiraj"
    And click in newsletter box
    And enter password "test123"
    And confirm password "test123"
    And click on the register button
    Then user should be able to register successfully
    And user should able to see registration successful message