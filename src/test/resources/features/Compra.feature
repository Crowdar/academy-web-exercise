Feature: Como cliente quiero acceder al sitio de compras y realizar un pedido

  @Compra
  Scenario Outline: El cliente incia sesion en el sitio y realiza la compra de un producto
    Given El cliente se encuentra en la pantalla de home
    When El cliente hace un click en el boton sign in
    Then El cliente verifica que fue redireccionado a la pagina de Login

    When El cliente ingresa el <email>
    And El cliente ingresa su <password>
    And El cliente hace click en el segundo boton sign in verde
    Then El cliente verifica que fue redireccionado a la pantalla de My Account

    When El cliente da click en el boton home
    Then El cliente verifica que fue redirecionado a la pantalla de home

    When El cliente hace click en una <categoria>
    And El cliente verifica que se redirecciona a la pagina seleccionada
    And El cliente hace click en un producto del listado
    Then El cliente verifica que fue redireccionado a la pagina del producto clickeado

    When El cliente hace click en el boton add to cart
    And El cliente hace click en el boton procced to checkout
    Then El cliente verifica que fue redirigido a la pagina del carrito

    When El cliente clickea el boton procced to checkout
    Then El cliente verifica que se redirecciona a la pagina de direcciones

    When El cliente hace click sobre el boton procced to checkout
    Then El cliente verifica que fue redireccionado a la pagina de envio

    When El cliente hace click en el checkbox acepto terminos y condiciones
    And El cliente hace click en el boton: procced to checkout
    Then El cliente verifica que fue redireccionado a la pagina de pago

    When El cliente hace click en la forma de pago
    Then El cliente verifica que fue redireccionado a la pagina de resumen de compra

    When El cliente hace click en el boton: -> I confirnm my order
    Then El cliente verifica que es redirgido a la pagina de confirmacion de compra



    Examples:
    | categoria | email                | password |
    | Women     | dminguez33@gmail.com | password |
    | Dresses   | dminguez33@gmail.com | password |
    | T-Shirts  | dminguez33@gmail.com | password |