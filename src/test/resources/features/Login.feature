Feature: Como cliente quiero realizar una compra


  @ProcesoCompra @Login
  Scenario: El cliente inica sesión en el sitio de compras
    Given el cliente se encuentra en la página de home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email:direccionfalsa1@live.com
    And el cliente ingresa su password:12345
    And el cliente hace click en el botón Sign in2
    Then el cliente verifica que fue redireccionado a la pantalla de My Account

    When el cliente hace click en el botón t-shirt
    Then el cliente verifica que fue redireccionado a la pantalla de compra T-shirt

    When el cliente hace click en el botón articulo
    Then el cliente verifica que fue redireccionado a la pantalla de articulo

    When el cliente hace click en el botón add to cart
    And el cliente hace click en el botón proceed to checkout1
    Then el cliente verifica que fue redireccionado a la pantalla de Shopping-Cart Summary


    When el cliente hace click en el botón proceed to checkout2
    Then el cliente verifica que fue redireccionado a la pantalla de Addresses


    When el cliente hace click en el botón proceed to checkout3
    Then el cliente verifica que fue redireccionado a la pantalla de Shipping


    When el cliente hace click en el botón terms of service
    And el cliente hace click en el botón proceed to checkout4
    Then el cliente verifica que fue redireccionado a la pantalla de Payment Method


    When el cliente hace click en el botón pay by bank wire
    Then el cliente verifica que fue redireccionado a la pantalla de Order Summary


    When el cliente hace click en el botón I confirm my order
    Then el cliente verifica que fue redireccionado a la pantalla de Order confirmation