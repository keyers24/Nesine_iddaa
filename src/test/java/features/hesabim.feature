@MyAccount
Feature: My Account
  Scenario Outline: Promotions
    Given Nesine application opens
    When Login with correct "<userName>" and "<Password>"
    And  Go to my account page via the homepage go there
    And  Navigate to promotions page
    And  Enter the promotion code
    And  Enter the Security Code
    And  Click on the close button
    Then  Check on the My Account page
    Examples:
      |userName|Password|
      |your informations  |your informations|

    @PersonalInfo
  Scenario Outline: Personal Information
    Given Nesine application opens
    When Login with correct "<userName>" and "<Password>"
    And  Go to my account page via the homepage go there
    And  Navigate to Personal Information page
    Then  Check on the membership number
    Examples:
      |userName|Password|
      |your informations  |your informations|