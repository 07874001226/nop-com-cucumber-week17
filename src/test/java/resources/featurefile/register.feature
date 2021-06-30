Feature: Register page Test
  As a user I want to register into nop commerce website


  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When  I click on register link
    Then I should navigate to register page successfully

  @Regression,@Smoke,@Sanity
  Scenario: User should verify errormessage with first name empty
    Given I am on homepage
    When  I click on register link
    And I enter lastname <"patel">
    And  I enter email <"vrajeshpatel13583@yahoo.com">
    And I enter password <"abc1234">
    And I enter confirm password on  <"abc1234">
    And  I click on register button
    Then I should see the error message

  @Regression
  Scenario: User should verify register successfully
    Given I am on homepage
    When  I click on register link
    And I enter firstname <"vrajesh">
    And I enter lastname <"patel">
    And  I enter email <"vrajeshpatel@yahoo.com">
    And I enter password <"abc1234">
    And I enter confirm password on  <"abc1234">
    And  I click on register button
    Then I should see verify register page successfully