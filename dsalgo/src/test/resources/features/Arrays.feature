@tag
Feature: Arrays

  @tag1
  Scenario: Array
    Given The user is in the Home page after logged in
    When user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Arrays in Python" link
    Then The user should be directed to "Arrays in Python" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    
		Given The user is in the Array page after logged in
    When The user clicks "Arrays using List" link
    Then The user should be directed to "Arrays using List" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    
		Given The user is in the Array page after logged in
    When The user clicks "Basic Operations in Lists" link
    Then The user should be directed to "Basic Operations in Lists" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
   Given The user is in the Array page after logged in
   When The user clicks "Applications of Array" link
   Then The user should be directed to "Applications of Array" Page
   When The user clicks "Try Here" button
   Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    When The user clicks the back button
    Then The user should be directed to "Applications of Array" Page
    When The user clicks the "Practice Questions" link
    Then The user should be redirected to  the "Practice" page in Array
    
    
    When The user clicks "Search the array" link
    Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
    
    Given The user is in the Practice Page
    When The user clicks "Max Consecutive Ones" link
    Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
    
    Given The user is in the Practice Page
    When The user clicks "Find Numbers with Even Number of Digits" link
    Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons

    Given The user is in the Practice Page
    When The user clicks "Squares of  a Sorted Array" link
    Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons