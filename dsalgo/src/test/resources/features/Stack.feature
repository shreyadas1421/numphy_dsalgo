@tag
Feature: Stack

  @tag1
  Scenario: Stack
    Given The user is in the Home page after logged in
    When user clicks on Stack Get Started button
    Then The user should be directed to "Stack" Page
    
    
    When The user clicks "Operations in Stack" link
    Then The user should be directed to "Operations in Stack" Page
     When The user clicks "Try Here" button
   Then The user should be redirected to a page having an tryEditor with a Run button to test

    Given The user is in the Stack page after logged in
    When The user clicks "Implementation" link
   Then The user should be directed to "Implementation" Page
   When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
   
    Given The user is in the Stack page after logged in
    When The user clicks "Applications" link
    Then The user should be directed to "Applications" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    When The user clicks "Practice Questions" link in Stack Page
    Then The user should be directed to "Practice" page in Stack 
    