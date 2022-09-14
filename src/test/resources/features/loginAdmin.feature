 Feature: Login User Admin
 
  Scenario: User invalid login Admin
    When User Admin go to Web Dika Siloam 
    And User Admin enter Invalid username and password
    And User Admin click button login_invalid
    Then User enter invalid credentials
    
  Scenario: User valid login Admin
    When User Admin enter valid username and password
    And User click button login valid
    Then User enter valid credentials
