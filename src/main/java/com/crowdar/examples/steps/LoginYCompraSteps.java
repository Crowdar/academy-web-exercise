package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.examples.pages.CompraHomePage;
import com.crowdar.examples.pages.StoreHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginYCompraSteps {
    @Given("el cliente se encuentra en la pagina de Home")
    public void elClienteSeEncuentraEnLaPaginaDeHome() {
        Injector._page(StoreHomePage.class).go();
        Injector._page(StoreHomePage.class).verifyHome();
    }

    @When("el cliente hace click en el botón (.*)")
    public void elClienteHaceClickEnElBotónSignIn(String button) {
        Injector._page(StoreHomePage.class).clickButton(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(String pantalla) {
        Injector._page(StoreHomePage.class).redirectScreen(pantalla);
    }

    @When("el cliente ingresa su email:(.*)")
    public void elClienteIngresaSuEmailPruebaPruebaCom(String mail) {
        Injector._page(StoreHomePage.class).enterEmail(mail);
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPassword(String password) {
        Injector._page(StoreHomePage.class).enterPassword(password);
    }

    @When("el cliente selecciona la opcion (.*)")
    public void elClienteSeleccionaLaOpcionDRESSES(String button) {
        Injector._page(StoreHomePage.class).clickButton(button);
    }

    @Then("el usuario se redirecciona a la pantalla de (.*)")
    public void seRedireccionaALaPantallaDeDRESSES(String pantalla) {
        Injector._page(StoreHomePage.class).redirectScreen(pantalla);
    }

    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBotonSummerDresses(String button) {
        Injector._page(StoreHomePage.class).clickButton(button);
    }

    @Then("se redirecciona a la pantalla de (.*)")
    public void seRedireccionaALaPantallaDeSummerDresses(String pantalla) {
        Injector._page(StoreHomePage.class).redirectScreen(pantalla);
    }

    @When("el cliente selecciona la opcion item")
    public void elClienteSeleccionaLaOpcionItem() {
    }



   /* @When("el cliente selecciona la opcion (.*)")
    public void elClienteSeleccionaLaOpcionDRESSES(String button) {
        Injector._page(CompraHomePage.class).dressesSelect();
    }


    @Then("se redirecciona a la pantalla de (.*)")
    public void seRedireccionaALaPantallaDeDRESSES(String pantalla) {
        Injector._page(CompraHomePage.class).verificarPantallaDresses();
    }


    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBotonSummerDresses(String button) {
        Injector._page(CompraHomePage.class).summerDressesSelect();
    }

    @And("el cliente presiona I agree")
    public void elClientePresionaIAgree() {

    }*/


}
