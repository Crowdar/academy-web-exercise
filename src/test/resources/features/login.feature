Feature: Como cliente, quiero eingresar las credenciales de mi cuenta, para ingresar al sitio de compras

  @Login
  Scenario: El cliente inicia sesión en el sito de compras
    Given el cliente se encuentra en la pagina home
    When el cliente hace click en el boton Sign in
    Then el cliente verifica que fué redireccionado a la pantalla login

    When el cliente ingresa su email: luisjivillalba@gmail.com
    And el cliente ingresa su password: asd123
    And el cliente hace click en el boton: Sign in verde
    Then el cliente verifica que fué recdireccionado a la pantalla My Account
