Feature:  
	Como cliente quiero ingresar a la página y realizar una compra
	 
@Buy @Smoke
Scenario: El cliente realiza una compra

  Given El cliente se encuentra en la pantalla Home
  When El cliente clickea sobre el botón Sign In
  Then El cliente verifica que fue redireccionado a la pantalla Login
    
  When El cliente ingresa su email: gerquino@gmail.com
  And El cliente ingresa su password: a4b3c2d1
  And El cliente clickea sobre el botón Sign In
  Then El cliente verifica que fue redireccionado a la pantalla My Account

	When El cliente clickea sobre el botón T-Shirts 
	Then El cliente verifica que fue redireccionado a la pantalla T-Shirts

	When El cliente clickea sobre el botón Add to cart
	Then El cliente verifica que fue redireccionado a la pantalla Product Succesfully Added
	
	When El cliente clickea sobre Proceed to checkout 
	And El cliente verifica que fue redireccionado a la pantalla Summary
	And El cliente clickea sobre Proceed to checkout
	And El cliente verifica que fue redireccionado a la pantalla Address
	And El cliente clickea sobre Proceed to checkout
	And El cliente verifica que fue redireccionado a la pantalla Shipping 
	And El cliente clickea sobre el botón I agree to the terms
	And El cliente clickea sobre Proceed to checkout 
	And El cliente verifica que fue redireccionado a la pantalla Payment
	And El cliente clickea sobre el botón Pay by bank wire 
	And El cliente verifica que fue redireccionado a la pantalla Bank-wire payment
	And El cliente clickea sobre el botón I confirm my order
	Then El cliente verifica que fue redireccionado a la pantalla Order confirmation
	
	
	
	
	
