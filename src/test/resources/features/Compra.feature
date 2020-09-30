Feature: Como cliente quiero seleccionar un objeto y comprarlo

  @Smoke @Compra @LoginAlPrincipio
  Scenario Outline: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la página Home
    When el cliente hace click en el botón Sign In de la página Home
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: zxc@gmail.com
    And el cliente ingresa su password: 12345
    And hace click en el botón Sign In de la página Login
    Then el cliente verifica que fue redireccionado a la pantalla de My Account

    When el cliente hace click en el botón <Categoria> de la página My Account
    Then el cliente verifica que fue redireccionado a la pantalla de <Categoria>

    When el cliente desea comprar <Item>
    And hace click en el botón Add To Cart de la página Producto
    And el cliente ingresa <Cantidad> en cantidad
    And hace click en el botón Proceed To Checkout de la página Producto
    And hace click en el botón Checkout Para Address de la página Order
    And hace click en el botón Checkout Para Shipping de la página Order
    And hace click en el botón Terms Of Service de la página Order
    And hace click en el botón Checkout Para Payment de la página Order
    And hace click en el botón <Forma De Pago> de la página Order
    And hace click en el botón I Confirm My Order de la página Order
    Then el cliente verifica que fue redireccionado a la pantalla de Order Confirmation

    Examples:
    | Categoria | Item                        | Cantidad  | Forma De Pago     |
    | Women     | Blouse                      | 3         | Pay By Bank Wire  |
    | Dresses   | Printed Chiffon Dress       | 10        | Pay By Bank Wire  |
    | T-Shirts  | Faded Short Sleeve T-shirts | 4         | Pay By Check      |




  @Smoke @CompraSubCategoria @LoginAlPrincipio
  Scenario: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la página Home
    When el cliente hace click en el botón Sign In de la página Home
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: zxc@gmail.com
    And el cliente ingresa su password: 12345
    And hace click en el botón Sign In de la página Login
    Then el cliente verifica que fue redireccionado a la pantalla de My Account

    When el cliente hace click en el botón Women de la página My Account
    Then el cliente verifica que fue redireccionado a la pantalla de Women

    When el cliente hace click en el botón Sub categoría Tops de la página Women
    Then el cliente verifica que fue redireccionado a la pantalla de Tops

    When el cliente hace click en el botón Sub categoría T-Shirts de la página Tops
    Then el cliente verifica que fue redireccionado a la pantalla de T-Shirts

    When el cliente desea comprar Faded Short Sleeve T-shirts
    And hace click en el botón Add To Cart de la página Producto
    And el cliente ingresa 3 en cantidad
    And hace click en el botón Proceed To Checkout de la página Producto
    And hace click en el botón Checkout Para Address de la página Order
    And hace click en el botón Checkout Para Shipping de la página Order
    And hace click en el botón Terms Of Service de la página Order
    And hace click en el botón Checkout Para Payment de la página Order
    And hace click en el botón Pay By Bank Wire de la página Order
    And hace click en el botón I Confirm My Order de la página Order
    Then el cliente verifica que fue redireccionado a la pantalla de Order Confirmation
