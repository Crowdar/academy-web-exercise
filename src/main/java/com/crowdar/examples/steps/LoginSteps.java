package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import com.crowdar.examples.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina home")
    public void elClienteSeEncuentraEnLaPaginaHome() {
        Injector._page(ShopHomePage.class).go();
    }

    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBotonSignIn(String button) {
        Injector._page(ShopHomePage.class).clicks(button);
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla login")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaLogin() {
        Injector._page(SignInPage.class).verifySignIn();
    }


    @And("el cliente ingresa en el campo (.*) su dato: (.*)")
    public void elClienteIngresaPotTeclado(String box,String text) {
        Injector._page(SignInPage.class).setTextsBoxs(box,text);
    }

    @And("el cliente hace click en el boton: (.*)")
    public void elClienteHaceClickEnElBoton(String button) {
        Injector._page(SignInPage.class).clicks(button);
    }
}
