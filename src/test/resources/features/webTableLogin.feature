Feature: User should be able to login using credentials

  Background: User is on the login page
    Given user is on the login page of web table app

  Scenario: positive Login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders


  Scenario: positive Login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

    #1 implement this new step
    #2 create login method in WebTableLoginPage
    #3 this login method should have multiple different overloaded version


  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then user should see url contains orders