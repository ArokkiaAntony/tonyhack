@CancelBooking
Feature: Verifying Adactin Cancel Booking Details

  Scenario Outline: Verifying Adactin Cancel Booking page with generated Order Id
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
    And user should cancel the booking by saved Order Id
    Then user should verify after cancel booking success message "The booking has been cancelled."

    Examples: 
      | username   | password  | location | hotels      | room_type | num_of_room | check_in_date | check_out_date | adult_per_room | child_per_room | firstName | lastName | billingAddress              |
      | Arvinarvin | Arvin@124 | Sydney   | Hotel Creek | Standard  | 1 - One     | 25/11/2022    | 26/11/2022     | 1 - One        | 0 - None       | Sam       | A        | 1/108,thiru street, tanjore |

  Scenario Outline: Verifying Adactin Cancel Booking page with Existing  Order Id
    Given user is on the home page
    When user should perform login "<username>","<password>"
    Then user should verify login success message "Hello arvinarvin!"
    And user should cancel the Existing Order Id "<orderId>"
    Then user should verify after cancel booking success message "The booking has been cancelled."

    Examples: 
      | username   | password  | orderId    |
      | Arvinarvin | Arvin@124 | 2D8509N13B |
