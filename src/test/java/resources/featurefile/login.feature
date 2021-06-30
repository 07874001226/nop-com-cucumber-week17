Feature: Login Test
  As a user I want to login into nop Commerce website

  @Smoke,@Sanity,@Regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @Sanity,@Regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When  I click on register link
    And I enter firstname <"vrajesh">
    And I enter lastname <"patel">
    And  I enter email <"vrajeshpatel1995@yahoo.com">
    And I enter password <"abc1234">
    And I enter confirm password on  <"abc1234">
    And  I click on register button
    And I click on logout tab
    And I click on login link
    And  I enter email <"vrajeshpatel1995@yahoo.com">
    And I enter password <"abc1234">
    And I click on login button
    Then I should login successfully

  @Sanity,@Regression
  Scenario Outline: verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email             | password | errorMessage                                                                               |
      | abcd123@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | xyz@gmail.com     | abc123   | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | amdnff@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again. No customer account found |
