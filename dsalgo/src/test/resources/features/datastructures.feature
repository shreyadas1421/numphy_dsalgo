@Datastructures
Feature: Datastructures

  @datastructures
  Scenario: Data Structures - Introduction
    Given The user is in the Home page after logged in
    When user clicks on Get Started button
    Then user should land in "Data Structures - Introduction Page"
    Given user is in the Data Structures-Introduction page
    When The user clicks "Time Complexity" link
    Then The user should be redirected to "Time complexity" page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    #When The user Enters the scripts in python Language
    #Then The user should see the output in the console
    #When The user Enters the scripts which is not a python Language
    #Then User should receive "error message"
    #Then The User should accept the errormessage
    #When The user clicks the back button
    #When The user clicks "Practice Questions" link
    #Then The user should be redirected to "Practice" page
