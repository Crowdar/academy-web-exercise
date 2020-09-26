Feature: Como usuario, necesito seleccionar un producto para realizar una compra

  @Smoke @Shop
  Scenario Outline: El usuario inicia sesion y realiza la compra
    Given El usuario esta en el Home
    When clickea el boton Sign In
    Then es redirigido a la pantalla LOGIN

    When completa los campos con Email <email> y Contraseña <pass>
    And  clickea el boton Sign In
    Then es redirigido a la pantalla MY ACCOUNT

    When selecciona la categoria de articulos que desea ver <categoria>
    Then es redirigido a la pantalla <categoria>

    When selecciona el articulo: <nombreArticulo>
    Then es redirigido a la pantalla ARTICLE

    When selecciona la cantidad: <cantidad>
    And selecciona el talle: <talle>
    And selecciona el color: <color>
    And clickea el boton Add to cart
    And clickea el boton Proceed to checkout
    Then es redirigido a la pantalla SHOPPING-CART SUMMARY

    When clickea el boton Proceed to checkout
    Then es redirigido a la pantalla ADDRESSES

    When clickea el boton Proceed to checkout
    Then es redirigido a la pantalla SHIPPING

    When acepta los terminos del servicio
    And clickea el boton Proceed to checkout
    Then es redirigido a la pantalla PAYMENT METHOD

    When selecciona el metodo de pago <metodoPago>
    Then es redirigido a la pantalla ORDER SUMMARY

    When clickea el boton I confirm my order
    Then es redirigido a la pantalla ORDER CONFIRMATION



    Examples:
    |        email          |pass  |categoria   |nombreArticulo             |cantidad|talle|color |   metodoPago     |
    |gonzalosoriano@test.com|123456|  DRESSES   |Printed Chiffon Dress      |    3   |  M  |green |    check         |
    |gonzalosoriano@test.com|123456|  T-SHIRTS  |Faded Short Sleeve T-shirts|    2   |  S  |yellow|    bank wire     |
    |gonzalosoriano@test.com|123456|  WOMEN     |    Blouse                 |    5   |  L  |white |    bank wire     |