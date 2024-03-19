Feature: 
  To validate Login functionality of Facebook application

  Scenario: 
    To validate login by using invalid username and invalid password

    Given User is in facebook login page
    When User enter invalid username and invalid password
    And User click login button
    Then user should be in invalid credentials page
