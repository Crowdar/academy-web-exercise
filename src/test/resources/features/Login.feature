Feature: Como cliente quiero acceder al sitio de compras

@Login
Scenario: El cliente incia sesion en el sitio y realiza la compra de un producto
Given El cliente se encuentra en la pantalla de home
When El cliente hace un click en el boton sign in
Then El cliente verifica que fue redireccionado a la pagina de Login

When El cliente ingresa el <email>
And El cliente ingresa su <password>
And El cliente hace click en el segundo boton sign in verde
Then El cliente verifica que fue redireccionado a la pantalla de My Account