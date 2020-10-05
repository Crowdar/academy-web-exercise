Feature:  As a customer, enter your account credentials and make purchases on the site

  @Login
  Scenario Outline: The client goes to the shop page and login
    Given The client is in shopp page
    When Home page is displayed
    Then the client clicks the Sign In button

    When My Account page is displayed
    Then the form login is visible

    When The client logs in the application with: <email>, <password>
    Then the client submits the form

    Examples:
      | email                                | password  |
      | lindacristal.parrasanhueza@gmail.com | Testing29 |
      | lindacristal.parrasanhueza@gmail.com | Testing29 |


