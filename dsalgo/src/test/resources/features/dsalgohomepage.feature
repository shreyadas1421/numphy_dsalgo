Feature: dsalgo project

  Scenario: Home Page
    Given The user opens Home Page
    When The user clicks "Data Structures" drop down
    Then I shouls see 6 different data structure entries in that dropdown
    Then The user clicks any of the "Get Started" buttons below the data structures
    Then It should alert the user with a message "You are not logged in"
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
    When The user clicks "Register"
    Then The user should be redirected to Register form

  Scenario Outline: Register DSalgo portal
    #Given The user opens Home Page
    When The user clicks "Register"
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    When The user clicks "Register" button after entering Username with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox
    When The user clicks "Register" button after entering Username and password with Password Confirmation field empty
    Then It should display an error "Please fill out this field" below Password Confirmation textbox
    When The user clicks "Register" button after entering "<InvalidUsername>" and "<InvalidPassword>" in text fields
    Then It should display an error message "Please enter a valid username and Password"
    When The user clicks "Register" button after entering "<ValidUsername>" "<ValidPassword>" in username and password field and different password in Password Confirmation fields
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
    When The user clicks "Register" button after entering "<ValidUsername>" and "<ValidPassword>" in text fields

    #Then It should redirected to homepage.
    Examples: 
      | InvalidUsername | InvalidPassword | ValidUsername | ValidPassword |
      | @#dsal          | ds@qw           | Group1@dslgo  | dsalgo2024    |

  Scenario Outline: SigningIn portal
    #Given The user opens Home Page
    When The user clicks "Sign in"
    Then The user land on Login Page
    When The user clicks "Login" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    When The user clicks "Login" button with "<InvalidUsername>" Username and password fields empty
    Then It should display an error "Please fill out this field" below Password textbox
    When The user clicks "Login" button after entering "<InvalidUsername>" and "<InvalidPassword>" in username and password fields
    Then It should display an error message "Please enter a valid username and Password"
    When The user clicks "Login" button after entering ValidUsername and ValidPassword in username and password fields
    Then It should redirected to homepage.

    Examples: 
      | InvalidUsername | InvalidPassword |
      | @#dsal          | ds@qw           |
