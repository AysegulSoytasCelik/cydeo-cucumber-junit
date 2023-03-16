Feature: Wikipedia search functionality and verifications

  #WSF-45234 -->potential jira ticket number

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  @@scenarioOutline
  Scenario Outline:  Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And  User clicks wiki search button
    Then User sees "<expectedTitle>" is in the main header
    Then User sees "<expectedMainHeader>" is in the main header

    @soccerPlayers
    Examples: search values we are going to be using this scenario is as below
      | searchValue        | expectedTitle      | expectedMainHeader |
      | Steve Jobs         | Steve Jobs         | Steve Jobs         |
      | Christiano Ronaldo | Christiano Ronaldo | Christiano Ronaldo |
      | Bob Marley         | Bob Marley         | Bob Marley         |
      | Chuck Norris       | Chuck Norris       | Chuck Norris       |
      | Antony Hopkins     | Antony Hopkins     | Antony Hopkins     |

    @scientists
    Examples:
      | searchValue  | expectedTitle | expectedMainHeader |
      | Marie Curie  | Marie Curie   | Marie Curie        |
      | Kate Winslet | Kate Winslet  | Kate Winslet       |
