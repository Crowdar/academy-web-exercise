Feature:  As a logged in client, you make buys on the site.

  @Login
  Scenario Outline: The client goes to the home page and makes a buy

    Given the client is in the home page
    When the client selects an product in active <tab>
    Then the client completes the buy process with the payment method:<pay>

    Examples:
      | pay   | tab          |
      | bank  | Popular      |
      | check | Best Sellers |