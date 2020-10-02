Feature:  As a customer, enter your account credentials and make purchases on the site

  @Login
  Scenario Outline: The client goes to the shop page and login
    Given The page loaded correctly
    When the client clicks the Sign In button
    Then Home page is displayed

    When The client logs in the application with: <email>, <password>
    And the client clicks the Sign In button
    Then My Account page is displayed


    Examples:
      | email                                | password  |
      | lindacristal.parrasanhueza@gmail.com | Testing29 |


