Feature: Como cliente deseo iniciar sesión para realizar una compra

  @Buy
  Scenario Outline: El cliente se loguea y realiza una compra con su cuenta
    Given el cliente se encuentra en la pagina home
    When el cliente hace click en el boton Sign in
    Then el cliente verifica que fué redireccionado a la pantalla login

    When el cliente ingresa en el campo email su dato: <Email>
    And el cliente ingresa en el campo password su dato: <pass>
    And el cliente hace click en el boton: Sign in verde
    Then el cliente verifica que fué redireccionado a la pantalla My Account

    When el cliente clickea el boton: '<categoria>'
    Then el cliente verifica que fué redireccionado a la pantalla '<categoria>'

    When el cliente clickea un producto aleatorio
    Then el cliente verifica que fué redireccionado a la pantalla Detailed Item

    When el cliente clickea el boton.: Add to cart
    Then el cliente clickea el boton.: Proceed to checkout
    And el cliente verifica que fué redireccionado a la pantalla SHOPPING-CART SUMMARY

    When el cliente hace click en el boton-> Proceed to checkout
    Then el cliente verifica que fué redireccionado a la pantalla ADDRESSES


    When el cliente hace click en el boton.: Proceed to checkout
    Then el cliente verifica que fue redireccionado a la pagina SHIPPING

    When el cliente hace click en el boton:-> checkbox
    And el cliente hace click en el boton:-> Proceed to checkout
    Then el cliente verifica que fue redireccionado a la pagina PAYMENT

    When el cliente hace click  en el boton: Pay by bank
    Then el cliente verifica que fue redireccionado a la pagina ORDER SUMMARY

    When el cliente hace click en el  boton: I confirm my order
    Then el cliente verifica que fue redireccionado a la pagina ORDER CONFIRMATION

    Examples:
      | categoria | Email                    | pass   |
      | Women     | luisjivillalba@gmail.com | asd123 |
      | Dresses   | luisjivillalba@gmail.com | asd123 |
      | T-shirts  | luisjivillalba@gmail.com | asd123 |


