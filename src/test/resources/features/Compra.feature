Feature: Como cliente quiero acceder al sitio de compras y realizar un pedido
  @Compra
  Scenario Outline: El cliente incia sesion en el sitio y realiza la compra de un producto
    Given El cliente se encuentra en la pantalla de home
    When El cliente hace click en el boton sign in
    Then El cliente verifica que fue redireccionado a la pagina de Login

    When El cliente ingresa su email: dminguez33@gmail.com
    And El cliente ingresa su password: password
    And El cliente hace click en el boton: sign in verde
    Then El cliente verifica que fue redireccionado a la pantalla de My Account

    When El cliente hace click en el boton home
    Then El cliente verifica que fue redirecionado a la pantalla de home

    When El cliente hace click en una <categoria>
    And El cliente verifica que se redirecciona a la pagina seleccionada
    And El cliente elije un producto del listado
    Then El cliente hace click en el boton add to card

    Examples:
    | categoria | email                | password |
    | Women     | dminguez33@gmail.com | password |
    | Dresses   | dminguez33@gmail.com | password |
    | T-Shirts  | dminguez33@gmail.com | password |