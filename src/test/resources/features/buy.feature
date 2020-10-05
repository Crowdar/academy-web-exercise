Feature:  As a logged in client, you make buys on the site.


  Scenario Outline: The client goes to the home page and makes a buy

    Given The client is in home page
    When the client selects an product in active <tab>
    Then the client clicks the Add to cart button

    When  product successfully added modal is displayed
    Then the client clicks  checkout button

    When SHOPPING-CART SUMMARY page is displayed
    Then the client clicks  summary button

    When the client check shipping <address>
    Then the client clicks  address button

    When the terms and conditions is displayed
    Then the client clicks  shipping button

    When the client verifies the buy price
    Then then the client selects payment method: <pay>

    When ORDER SUMMARY page is displayed
    Then the client clicks  confirm order button

    Examples:
      | pay   | tab          | address                     |
      | bank  | Popular      | Plaza Huincul, Kansas 66012 |
      | check | Best Sellers | Otra direccion              |