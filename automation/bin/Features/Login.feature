Feature: Login
 
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title Should be "Dashboard"
    When User clicks on Log out link
    Then Page Title should be "Your store. Login"
    And close browser