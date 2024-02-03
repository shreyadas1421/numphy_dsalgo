@tag
Feature: QUEUE

  @tag1
  Scenario: Queue Page
    Given The user is in the Home page after logged in
    When user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Implementation of Queue in Python" link
    Then The user should be directed to "Implementation of Queue in Python" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test

   Given The user is in the Queue page after logged in
   When The user clicks "Implementation using collections.deque" link
   Then The user should be directed to "Implementation using collections.deque" Page
   When The user clicks "Try Here" button
   Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    Given The user is in the Queue page after logged in
    When The user clicks "Implementation using array" link
    Then The user should be directed to "Implementation using array" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
     Given The user is in the Queue page after logged in
     When The user clicks "Queue Operations" link
     Then The user should be directed to "Queue Operations" Page
     When The user clicks "Try Here" button
     Then The user should be redirected to a page having an tryEditor with a Run button to test
     
    When The user clicks the "Practice Questions" link in Queue Page
    Then The user should be redirected to  the "Practice" page in Queue