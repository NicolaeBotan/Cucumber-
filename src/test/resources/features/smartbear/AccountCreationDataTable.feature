@regressionDataTable
Feature: Testing Account Creation and Validation from SmartBear

  Scenario: Testing Validation of the First Payment Method
    When User enters the userName and password and hits logIn button
    Then User clicks on Order button
    Then User chooses product and enters quantity
      | product  | MyMoney |
      | quantity | 5       |
    And User enters the name, street, city, state, zipCode
      | name    | Nicolae Botan    |
      | street  | 422 S Orchard dr |
      | city    | Salt Lake City   |
      | state   | Utah             |
      | zipCode | 84054            |
    Then User chooses cardType and enters, cardNumber, expDate
      | cardType   | Visa          |
      | cardNumber | 9834117322811 |
      | expDate    | 03/26         |
    #IN DATA TABLE THE PARAMETERS ARE WRITTEN BELOW THE STEP BECAUSE IT BELONGS TO THE STEP
    Then User clicks Process Button and Validates the message
      | New order has been successfully added. |
    #In LIST when you have only one parameter you just provide in pipes only the value, as List format not Map


    #Then User validates all information '<name>','<product>','<quantity>','<street>','<city>','<state>','<zipCode>','<cardType>','<cardNumber>','<expDate>'

    #      | product     | quantity | name          | street           | city           | state   | zipCode | cardType         | cardNumber    | expDate | message                                |
    #      | MyMoney     | 5        | Nicolae Botan | 422 S Orchard dr | Salt Lake City | Utah    | 84054   | Visa             | 9834117322811 | 03/26   | New order has been successfully added. |
    #