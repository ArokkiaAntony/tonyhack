@SearchHotel
Feature: Verifying Adactin Search Page details

  Scenario Outline: veify Adactin Search Page with all details
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07/11/2022    | 08/11/2022     | 1 - One        | 1 - One        |

  Scenario Outline: veify Adactin Search Page with mandatory details
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter only mandatory fields in Search Hotel "<location>","<num_of_room>","<check_in_date>","<check_out_date>" and "<adult_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"

    Examples: 
      | username   | password  | location | num_of_room | check_in_date | check_out_date | adult_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | 1 - One     | 07/11/2022    | 08/11/2022     | 1 - One        |

  Scenario Outline: veify Adactin Search Page with Check in and Check out Date fileds box
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify invalid date error message "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 09/11/2023    | 08/11/2022     | 1 - One        | 1 - One        |

  Scenario Outline: Without entering any field click Search botton
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter without any fields and Enter Search botton
    Then user should verify invalid error message "Please Select a Location"

    Examples: 
      | username   | password  |
      | Arvinarvin | Arvin@124 |
