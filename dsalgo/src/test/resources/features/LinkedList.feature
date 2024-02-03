@tag
Feature: LinkList

  Scenario: HomePage Validation
    Given The user is in the Home page after logged in
    When user clicks on LinkList Get Started button
    Then The user should be directed to "Linked List" Page
    When The user clicks "Introduction" link
    Then The user should be directed to "Introduction" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Creating Linked LIst" link
    Then The user should be directed to "Creating Linked LIst" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Types of Linked List" link
    Then The user should be directed to "Types of Linked List" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Implement Linked List in Python" link
    Then The user should be directed to "Implement Linked List in Python" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Traversal" link
    Then The user should be directed to "Traversal" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Insertion" link
    Then The user should be directed to "Insertion" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is in the Linked List page after logged in
    When The user clicks "Deletion" link
    Then The user should be directed to "Deletion" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    # Given The user is in the Linked List page after logged in
    When The user clicks "Practice Questions" link in Linked List Page
    Then The user should be directed to "Practice" page in Linked List
