
@Login
Feature: Login and Logout feature
  Scenario: Login to member partai portal
    Given User open browser
    When User type URL https://member-partai-perindo.web.app/
    And User landing in login page
    And User tap enter button
    And User enter phone number 088811133667
    And User enter password ric123
    And User tap login
    Then User successfully login in member partai homepage
    And User tap hamburger button
    And User tap logout menu
    And user tap yes
    And User landing back in login page
    And User close browser

  Scenario Outline: Validate error message appear while login with invalid phone number format
    Given User open browser
    When User type URL https://member-partai-perindo.web.app/
    And User landing in login page
    And User tap enter button
    When User enter phone number <invalid phone number>
    And User enter password ric123
    Then User tap login
    And Alert card message appear with description
    And User close browser
    Examples:
      |invalid phone number|
      |987234              |


