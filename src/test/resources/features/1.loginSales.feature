 Feature: Login User
 
  Scenario: User invalid login
    When User go to Web Dika Siloam
    And User enter Invalid username and password
    And User click button login_invalid
    Then User enter invalid credentials
    
  Scenario: User valid login
    When User enter valid username and password
    And User click button login valid
    Then User enter valid credentials
