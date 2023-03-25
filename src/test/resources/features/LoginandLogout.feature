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



#  Scenario: Login with unregistered number
#
#    Then
