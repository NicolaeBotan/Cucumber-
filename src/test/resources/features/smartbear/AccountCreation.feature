@regression
Feature: Testing Account Creation and Validation from SmartBear

#  Scenario Outline: Testing Validation of the First Payment Method
#    When User enters the userName and password and hits logIn button
#    Then User clicks on Order button
#    Then User chooses '<product>' and enters '<quantity>'
#    And User enters the '<name>' and '<street>' and '<city>' and '<state>' and '<zipCode>'
#    Then User chooses '<cardType>' and enters '<cardNumber>' and '<expDate>'
#    Then User clicks Process Button and Validates the message '<message>'
#    Then User validates all information '<name>','<product>','<quantity>','<street>','<city>','<state>','<zipCode>','<cardType>','<cardNumber>','<expDate>'
#
#    Examples:
#      | product     | quantity | name          | street           | city           | state   | zipCode | cardType         | cardNumber    | expDate | message                                |
#      | MyMoney     | 5        | Nicolae Botan | 422 S Orchard dr | Salt Lake City | Utah    | 84054   | Visa             | 9834117322811 | 03/26   | New order has been successfully added. |
#      | FamilyAlbum | 7        | Maxim David   | 335 Blair dr     | Jackson        | Wyoming | 83002   | MasterCard       | 9881112000977 | 03/25   | New order has been successfully added. |
#      | ScreenSaver | 3        | Justin Timber | 422 S Orchard dr | Denver         | Oregon  | 75003   | American Express | 9834117322811 | 03/29   | New order has been successfully added. |

  Scenario Outline: Testing Validation of the First Payment Method
    When User enters the userName and password and hits logIn button
    Then User clicks on Order button
    Then User chooses '<product>' and enters '<quantity>'
    And User enters the '<name>' and '<street>' and '<city>' and '<state>' and '<zipCode>'
    Then User chooses '<cardType>' and enters '<cardNumber>' and '<expDate>'
    Then User clicks Process Button and Validates the message '<message>'
    Then User validates all information '<name>','<product>','<quantity>','<street>','<city>','<state>','<zipCode>','<cardType>','<cardNumber>','<expDate>'

    Examples:
      | product     | quantity | name          | street           | city           | state   | zipCode | cardType         | cardNumber    | expDate | message                                |
      | MyMoney     | 5        | Nicolae Botan | 422 S Orchard dr | Salt Lake City | Utah    | 84054   | Visa             | 9834117322811 | 03/26   | New order has been successfully added. |
      | FamilyAlbum | 7        | Maxim David   | 335 Blair dr     | Jackson        | Wyoming | 83002   | MasterCard       | 9881112000977 | 03/25   | New order has been successfully added. |
      | ScreenSaver | 3        | Justin Timber | 422 S Orchard dr | Denver         | Oregon  | 75003   | American Express | 9834117322811 | 03/29   | New order has been successfully added. |
