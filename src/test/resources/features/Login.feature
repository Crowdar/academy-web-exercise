Feature: Como cliente quiero ingresar mis credenciales para poder acceder al sitio de compras

  @Login
  Scenario: El cliente incia sesion en el sitio de compras
    Given El cliente se encuentra en la pantalla de home
    When El cliente hace click en el boton sign in
    Then El cliente verifica que fue redireccionado a la pagina de Login

    When El cliente ingresa su email: dminguez33@gmail.com
    And El cliente ingresa su password: password
    Then El cliente verifica que fue redireccionado a la pantalla de My Account