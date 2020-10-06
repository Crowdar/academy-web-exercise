Feature: Como cliente quiero ingresar los credenciales de mi cuenta para ingresar al sitio de compras

  @Login
  Scenario: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: prueba1@xxx.com
    And el cliente ingresa su password: 12345
    And el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de My Account


   # When el cliente selecciona la opcion DRESSES
    #Then el usuario se redirecciona a la pantalla de DRESSES

    #When el cliente hace click en el boton Summer Dresses
    #Then se redirecciona a la pantalla de Summer Dresses

    #When el cliente selecciona la opcion item
    #Then se redirecciona a la pantalla de producto

    #When el cliente hace click en el boton Add to cart
   #Then se redirecciona a la pantalla de Product successfully added
    #And el cliente hace click en el boton Proceded to checkout

    #Then se redirecciona a la pantalla de SHOPPING-CART SUMMARY
    #And  el cliente hace click en el boton Proceded to checkout
    #Then se redirecciona a la pantalla de ADDRESSES
    #And  el cliente hace click en el boton Proceded to checkout
    #Then se redirecciona a la pantalla de SHIPPING

    #And  el cliente presiona I agree
    #And  el cliente hace click en el boton Proceded to checkout
    #Then se redirecciona a la pantalla de PLEASE CHOOSE YOUR PAYMENT METHOD

    #And  el cliente selecciona la opcion Pay by bank wire
    #And  el cliente hace click en el boton I confirm
   # Then se redirecciona a la pantalla de ORDER CONFIRMATION