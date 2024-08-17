@Login
Feature: Login
  @SuccessLogin
  Scenario Outline: SuccessLogin
    Given Nesine application opens
    When Login with correct "<userName>" and "<Password>"
    And  Go to my account page via the homepage go there
    And  Click on the “Log Out” button
    Then It is seen that you are logged out.
    Examples:
    |userName|Password|
    |your informations  |your informations|

  @FailLogin
  Scenario Outline: FailLogin
    Given Nesine application opens
    When Login with wrong  "<userName>" and "<Password>"
    Then Error message is displayed
    Examples:
      |userName|Password|
      |your informations |your informations|