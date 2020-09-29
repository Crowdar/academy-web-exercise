package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.*;

public class StoreSteps extends PageSteps {

    @Given("El cliente se encuentra en la pantalla de home")
    public void elClienteSeEncuentraEnLaPantallaDeHome() {
        Injector._page(StoreHomePage.class).go();
    }

    @When("El cliente hace un click en el boton sign in")
    public void elClienteHaceUnClickEnElBotonSignIn() {
        Injector._page(StoreHomePage.class).clickSignInButton();
    }

    @Then("El cliente verifica que fue redireccionado a la pagina de Login")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDeLogin() {
        Injector._page(StoreLoginPage.class).verifyLogin();
    }

    @When("El cliente ingresa el (.*)")
    public void elClienteIngresaEl(String email) {
        Injector._page(StoreLoginPage.class).completeEmail(email);
    }

    @And("El cliente ingresa su (.*)")
    public void elClienteIngresaSu(String password) {
        Injector._page(StoreLoginPage.class).completePassword(password);
    }

    @And("El cliente hace click en el segundo boton sign in verde")
    public void elClienteHaceClickEnElSegundoBotonSignInVerde() {
        Injector._page(StoreLoginPage.class).clickButtonSignIn();
    }

    @Then("El cliente verifica que fue redireccionado a la pantalla de My Account")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeMyAccount() {
        Injector._page(StoreMyAccountPage.class).VerifyMyAccountPage();
    }

    @When("El cliente da click en el boton home")
    public void elClienteDaClickEnElBotonHome() {
        Injector._page(StoreMyAccountPage.class).clickButtonHome();
    }

    @Then("El cliente verifica que fue redirecionado a la pantalla de home")
    public void elClienteVerificaQueFueRedirecionadoALaPantallaDeHome() {
        Injector._page(StoreHomePage.class).verifyHome();
    }

    @When("El cliente hace click en una (.*)")
    public void elClienteHaceClickEnUna(String categoria) {
        Injector._page(StoreHomePage.class).clickCategoryButton(categoria);
    }

    @And("El cliente verifica que se redirecciona a la pagina seleccionada")
    public void elClienteVerificaQueSeRedireccionaALaPaginaSeleccionada() {
        Injector._page(StoreCategoryPage.class).verifyPage();
    }

    @And("El cliente hace click en un producto del listado")
    public void elClienteHaceClickEnUnProductoDelListado() {
      Injector._page(StoreCategoryPage.class).clickProduct();

    }

    @Then("El cliente verifica que fue redireccionado a la pagina del producto clickeado")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDelProductoClickeado() {
        Injector._page(StoreProductPage.class).verifyPage();
    }

    @When("El cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBoton(String boton) {
        Injector._page(StoreProductPage.class).clickButton(boton);
    }


    @Then("El cliente verifica que fue redirigido a la pagina del carrito")
    public void elClienteVerificaQueFueRedirigidoALaPaginaDelCarrito() {
        Injector._page(StoreCartPage.class).verifyPage();
    }

    @When("El cliente clickea el boton procced to checkout")
    public void elClienteClickeaElBotonProccedToCheckout() {
        Injector._page(StoreCartPage.class).clickProccedToCheckout();
    }

    @Then("El cliente verifica que se redirecciona a la pagina de direcciones")
    public void elClienteVerificaQueSeRedireccionaALaPaginaDeDirecciones() {
        Injector._page(StoreAddressPage.class).verifyPage();
    }

    @When("El cliente hace click sobre el boton procced to checkout")
    public void elClienteHaceClickSobreElBotonProccedToCheckout() {
        Injector._page(StoreAddressPage.class).clickProccedToCheckout();
    }

    @Then("El cliente verifica que fue redireccionado a la pagina de envio")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDeEnvio() {
        Injector._page(StoreShippingPage.class).verifyPage();
    }

    @When("El cliente hace click en el checkbox acepto terminos y condiciones")
    public void elClienteHaceClickEnElCheckboxAceptoTerminosYCondiciones() {
        Injector._page(StoreShippingPage.class).clickCheckbox();
    }

    @And("El cliente hace click en el boton: procced to checkout")
    public void elClienteHaceClickEnElBotonProccedToCheckout() {
        Injector._page(StoreShippingPage.class).clickProccedToCheckout();
    }

    @Then("El cliente verifica que fue redireccionado a la pagina de pago")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDePago() {
        Injector._page(StorePaymentPage.class).verifyPage();
    }

    @When("El cliente hace click en la forma de pago")
    public void elClienteHaceClickEnLaFormaDePago() {
        Injector._page(StorePaymentPage.class).clickPayForm();
    }

    @Then("El cliente verifica que fue redireccionado a la pagina de resumen de compra")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDeResumenDeCompra() {
        Injector._page(StoreSumaryOrderPage.class).verifyPage();
    }

    @When("El cliente hace click en el boton: -> I confirnm my order")
    public void elClienteHaceClickEnElBotonIConfirnmMyOrder() {
        Injector._page(StoreSumaryOrderPage.class).clickConfirmMyOrder();
    }

    @Then("El cliente verifica que es redirgido a la pagina de confirmacion de compra")
    public void elClienteVerificaQueEsRedirgidoALaPaginaDeConfirmacionDeCompra() {
        Injector._page(StoreConfirmedOrderPage.class).verifyPage();
    }
}
