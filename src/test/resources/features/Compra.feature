Feature: Como cliente quiero seleccionar un objeto y comprarlo

  @Smoke @Compra @LoginAlPrincipio
  Scenario: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la página Home
    When el cliente hace click en el botón Sign In de la página Home
    #Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: zxc@gmail.com
    And el cliente ingresa su password: 12345
    And el cliente hace click en el botón Sign In de la página Login
#    Then el cliente verifica que fue redireccionado a la pantalla de My Account

    When el cliente hace click en el botón T-Shirts de la página My Account
 #   Then el cliente verifica que fue redireccionado a la pantalla de T-Shirts

    When el cliente hace click en el botón Add To Cart de la página Producto
   # Then el cliente verifica que fue redireccionado a la pantalla de Producto

    #When el cliente ingresa 3 en cantidad
    And el cliente hace click en el botón Add To Cart de la página Producto
    And el cliente hace click en el botón Proceed to checkout de la página producto
    #Then el cliente verifica que fue redireccionado a la pantalla de Order

    When el cliente hace click en el botón Checkout Para Address de la página Order
    And el cliente hace click en el botón Checkout Para Shipping de la página Order
    And el cliente hace click en el botón Terms of service de la página Order
    And el cliente hace click en el botón Checkout Para Payment de la página Order
    And el cliente hace click en el botón Pay by bank wire de la página Order
    And el cliente hace click en el botón I Confirm My Order de la página Order
 #   Then el cliente verifica que fue redireccionado a la pantalla de Order Confirmation
