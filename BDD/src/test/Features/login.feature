Feature: Testing application login

  Scenario: Login to FB page
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
    

