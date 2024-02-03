@tag
Feature: Graph

  @tag1
  Scenario: Graph
    Given The user is in the Home page after logged in
    When user clicks on Graph Get Started button
    Then The user should be directed to "Graph" Page
    When The user clicks "Graph" link in Graph page
    Then The user should be directed to "Graph" page in Graph
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Graph page after logged in
    When The user clicks "Graph Representations" link
    Then The user should be directed to "Graph Representations" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user clicks the "Practice Questions" link in Graph Page
    Then The user should be redirected to  the "Practice" page in Graph
