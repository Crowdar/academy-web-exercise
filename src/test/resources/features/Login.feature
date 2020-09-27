Feature:  
	Como cliente quiero ingresar a la página y loguearme
	 
@Login @Smoke
Scenario Outline: El cliente inicia sesión

 Given El cliente se encuentra en la pantalla Home
 When El cliente clickea sobre el botón Sign In
 Then El cliente verifica que fue redireccionado a la pantalla Login
    
 When El cliente ingresa su email: <email>
 And El cliente ingresa su password: <password>
 And El cliente clickea sobre el botón Sign In
 Then El cliente puede ver mensaje de <resultado>
 
 Examples:
 		|email								|password					|resultado					|
 		|error@error.com			|abcd1234					|login incorrecto		|
 		|gerquino@gmail.com		|a4b3c2d1					|login correcto			|