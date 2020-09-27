package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuySteps extends PageSteps {
    @Then("el cliente verifica que fué redireccionado a la pantalla My Account")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaMyAccount() {
        Injector._page(MyAccountPage.class).verifyMyAccountPage();
    }

    @When("el cliente clickea el boton: '(.*)'")
    public void elClienteClickeaElBotonCategoria(String button) {
        Injector._page(MyAccountPage.class).clicks(button);
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla '(.*)'")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaCategoria(String page) {
        Injector._page(CategoriesPage.class).verifyCategoriPage(page);
    }

    @Given("el cliente clickea un producto aleatorio")
    public void elClienteClickeaUnProductoAleatorio() {
        Injector._page(CategoriesPage.class).selectRandomProduct();
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla Detailed Item")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaDetailedItem() {
        Injector._page(DetailedItemPage.class).verifyDetailedItemPage();
    }

    @When("el cliente clickea el boton.: (.*)")
    public void elClienteClickeaElBotonAddToCart(String button) {

        Injector._page(DetailedItemPage.class).clicks(button);
    }

    @And("el cliente verifica que fué redireccionado a la pantalla SHOPPING-CART SUMMARY")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaSHOPPINGCARTSUMMARY() {
        Injector._page(CartPage.class).verifySignIn();
    }


    @When("el cliente hace click en el boton-> (.*)")
    public void elClienteHaceClickEnElBotonProceedToCheckout(String button) {
        Injector._page(CartPage.class).clicks(button);
    }

    @Then("el cliente verifica que fué redireccionado a la pantalla ADDRESSES")
    public void elClienteVerificaQueFuéRedireccionadoALaPantallaADDRESSES() {
        Injector._page(AddressesPage.class).verifyAddresses();
    }

    @Then("el cliente hace click en el boton.: (.*)")
    public void elClienteHaceClickEnProceedToCheckout(String button) {
        Injector._page(AddressesPage.class).clicks(button);
    }

    @And("el cliente verifica que fue redireccionado a la pagina SHIPPING")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaSHIPPING() {
        Injector._page(ShippingPage.class).verifyShippingPage();
    }

    @When("el cliente hace click en el boton:-> (.*)")
    public void elClienteHaceClickEnElBotonCheckbox(String button) {
        Injector._page(ShippingPage.class).clicks(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pagina PAYMENT")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaPAYMENT() {
        Injector._page(PaimentPage.class).verifyPaimentPage();
    }

    @When("el cliente hace click  en el boton: (.*)")
    public void elClinteHaceClickEnElBotonPayByBank(String button) {
        Injector._page(PaimentPage.class).clicks(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pagina ORDER SUMMARY")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaORDERSUMMARY() {
        Injector._page(OrderSummary.class).verifyOrderSummary();
    }

    @When("el cliente hace click en el  boton: (.*)")
    public void elClienteHaceClickEnElBotonIConfirmMyOrder(String button) {
        Injector._page(OrderSummary.class).clicks(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pagina ORDER CONFIRMATION")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaORDERCONFIRMATION() {
        Injector._page(OrderConfirmationPage.class).verifyOrderSummary();
    }
}
