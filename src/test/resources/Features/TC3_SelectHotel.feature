@SelectHotel
Feature: Verifying Adactin Select Hotel Details

  Scenario Outline: Verifying Adactin Select Hotel page with preferred hotel selection
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"
    And user should select Hotel Name
    Then user should verify after select Hotel success message "Book A Hotel"

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07/11/2022    | 08/11/2022     | 1 - One        | 1 - One        |

  Scenario Outline: Verifying Adactin Select Hotel page without Clicking preferred hotel
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"
    And user should click continue without selecting hotel name
    Then user should verify error message "Please Select a Hotel"

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 07/11/2022    | 08/11/2022     | 1 - One        | 1 - One        |
