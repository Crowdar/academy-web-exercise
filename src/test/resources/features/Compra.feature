Feature: Como cliente quiero acceder al sitio de compras y realizar un pedido

  Scenario: El cliente incia sesion en el sitio de compras
    Given El cliente se encuentra en la pantalla de home
    When El cliente hace click en el boton sign in
    Then El cliente verifica que fue redireccionado a la pagina de Login

    When El cliente ingresa su email: dminguez33@gmail.com
    And El cliente ingresa su password: password
    Then El cliente verifica que fue redireccionado a la pantalla de My Account

  Scenario: El cliente realiza la compra de un producto
    Given El cliente se encuentra en la pantalla de My Account
    When El cliente hace click en el boton home
    Then El cliente verifica que fue redirecionado a la pantalla de home

    When El cliente hace click en women
    And El cliente verifica que se redirecciona a la pagina women
    And El cliente elije un producto del listado
    Then El cliente hace click en el boton add to card






