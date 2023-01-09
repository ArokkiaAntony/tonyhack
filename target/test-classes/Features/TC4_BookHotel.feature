@BookHotel
Feature: Verifying Adactin Book Hotel Details

  Scenario Outline: Verifying Adactin Book Hotel page with giving all entries in the fields
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"
    And user should select Hotel Name
    Then user should verify after select Hotel success message "Book A Hotel"
    And user should enter "<firstName>","<lastName>" and "<billingAddress>"
      | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 9098123412341234 | American Express | November     |        2022 |        342 |
      | 6576435712349746 | VISA             | December     |        2022 |        252 |
      | 8754190945106395 | Master Card      | November     |        2022 |        524 |
      | 6685387975134786 | Other            | December     |        2022 |        234 |
    Then user should verify after booking success message "Booking Confirmation" and save Order Id

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room | firstName | lastName | billingAddress              |
      | Arvinarvin | Arvin@124 | Paris    | Hotel Creek | Deluxe    | 2 - Two     | 25/12/2023    | 30/12/2023     | 2 - Two        | 1 - One        | Sam       | A        | 1/108,thiru street, tanjore |

  Scenario Outline: Verifying Adactin Book Hotel page without giving any entries in the fields
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    When user should enter all credentials in Search Hotel "<location>","<hotels>","<room_type>","<num_of_room>","<check_in_date>","<check_out_date>","<adult_per_room>" and "<child_per_room>"
    Then user should verify Search Hotel after Success Message "Select Hotel"
    And user should select Hotel Name
    Then user should verify after select Hotel success message "Book A Hotel"
    And user should not enter any entries in the fields
    Then user should verify error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 25/12/2023    | 30/12/2023     | 1 - One        | 1 - One        |
