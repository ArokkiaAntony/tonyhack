@Login
Feature: Verifying Adactin Hotel Login Details

  Scenario Outline: veify Login details with valid data
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"

    Examples: 
      | username   | password  |
      | Arvinarvin | Arvin@124 |

  Scenario Outline: veify Hotel Login using Enter key
    Given user is on the home page
    When user should perform login "<username>","<password>" with Enter Key
    Then user should verify login success message "Hello arvinarvin!"

    Examples: 
      | username   | password  |
      | Arvinarvin | Arvin@124 |

  Scenario Outline: veify Login details with Invalid data
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify after login with invalid credential error message contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | username   | password  |
      | Arvinarvin | Arvin@123 |
