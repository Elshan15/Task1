@signUpTest
Feature: New user registration


  Scenario: Create a New User
    Given I am on MoneyGaming home page
    When I try sign up for new account
    And I fill up sing up information
      | title     | Mr     |
      | firstName | John   |
      | surname   | Walker |
    And I check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18
    And I submit the form by clicking the JOIN NOW button
    Then I see ‘This field is required’ appears under the date of birth box





