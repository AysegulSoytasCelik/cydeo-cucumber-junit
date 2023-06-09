Feature: Web table user order feature

 @wip
  Scenario: User should be able to place order and order seen in web table
  Given user is already logged in and order page
    When user selects product type "Familybea"
    And user enters quantity "2"
    And  user enters customer name "Sharlock Holmes"
    And  user enters street "221B Baker Street"
    And  user enters city "London"
    And  user enters state "England"
    And  user enters zipcode "50505"
    And  user enters select credit card type "MasterCard"
    And user enters select credit card number "1111222333444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

