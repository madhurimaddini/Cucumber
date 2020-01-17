@Login
Feature: Login

Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User Opens URL "http://localhost:4200/login/pt"
    And Click on InitialLogin
    And User enter Email as "mark@pointchain.io" and Password as "pointchain"
    And Click on Login
    Then Page header Should be "Dan's Baked Goods"
    When User clicks on Log out link
    Then Check Log In Text "Login"
    
    
   
Scenario: Failure Login with InValid Login ID
    Given User Launch Chrome browser
    When User Opens URL "http://localhost:4200/login/pt"
    And Click on InitialLogin
    And User enter Email as "dummy@pointchain.io" and Password as "pointchain"
    And Click on Login
    Then Display Error as "Error: There is no user record corresponding to this identifier. The user may have been deleted."
 
  

Scenario: Failure Login with InValid Password
    Given User Launch Chrome browser
    When User Opens URL "http://localhost:4200/login/pt"
    And Click on InitialLogin
    And User enter Email as "dan@pointchain.io" and Password as "pointchain1"
    And Click on Login
    Then Display Error as "Error: The password is invalid or the user does not have a password."
  
  
    
Scenario: Failure Login without username and Password
    Given User Launch Chrome browser
    When User Opens URL "http://localhost:4200/login/pt"
    And Click on InitialLogin
    And Click on Login
    Then Display Error as "Error: The email address is badly formatted."
    
    
Scenario: Failure Login without Password
    Given User Launch Chrome browser
    When User Opens URL "http://localhost:4200/login/pt"
    And Click on InitialLogin
    And User enter Email as "dan@pointchain.io"
    And Click on Login
    Then Display Error as "Error: The password is invalid or the user does not have a password."
  
    
    
Scenario: Failure Login without Username
  Given User Launch Chrome browser
  When User Opens URL "http://localhost:4200/login/pt"
  And Click on InitialLogin
  And User enter Password as "pointchain"
  And Click on Login
  Then Display Error as "Error: The email address is badly formatted."

  
  