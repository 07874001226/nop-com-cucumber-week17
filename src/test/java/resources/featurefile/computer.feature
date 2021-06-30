Feature: Computer Test
  As a user want to check Computer Tab on nop commerce website

  @Regression,@Smoke,@Sanity
  Scenario: User should navigate to desktops page successfully
    Given I am on homepage
    When  I mousehover on computer tab
    And  I click on desktops
    Then I should navigate to desktops page successfully

  @Sanity,@Regression
  Scenario: User should navigate notebooke page successfully
    Given I am on homepage
    When  I mousehover on computer tab
    And I click on notebooks
    Then I should navigate to notebooks page succesfffully

  @Regression
  Scenario: User should navigate to software page successfully
    Given I am on homepage
    When  I mousehover on computer tab
    When  I click on software
    Then I should navigate to software page successfully