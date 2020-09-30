package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class compraShopSteps extends PageSteps{


    @Given("El usuario esta en el Home")
    public void EstaEnElHome() {
        Injector._page(HomePage.class).go();
        Injector._page(HomePage.class).verifyHomePage();
    }

    @When("clickea el boton (.*)")
    public void clickeaElBoton(String button) {
        Injector._page(HomePage.class).clickButtons(button);
    }

    @Then("es redirigido a la pantalla (.*)")
    public void esRedirigidoA(String pantalla) {
        Injector._page(HomePage.class).irAPantalla(pantalla);
    }

    @When("completa los campos con Email (.*) y Contraseña (.*)")
    public void completaConEmailYPassword(String email, String pass) {
        Injector._page(LoginPage.class).completeEmailPass(email, pass);
    }

    @When("selecciona la categoria de articulos que desea ver (.*)")
    public void seleccionaCategoriaDeArticulos(String category) {
        Injector._page(MyAccountPage.class).selectCategory(category);
    }

    @When("selecciona el articulo: (.*)")
    public void seleccionaArticulo(String articleName) {
        Injector._page(CategoryPage.class).selectArticle(articleName);
    }

    @When("selecciona la cantidad: (.*)")
    public void seleccionaCantidad(String cantidad) {
        Injector._page(ArticlePage.class).setQuantity(cantidad);
    }

    @And("selecciona el talle: (.*)")
    public void seleccionaTalle(String size) {
        Injector._page(ArticlePage.class).setSize(size);
    }

    @And("selecciona el color: (.*)")
    public void seleccionaColor(String color) {
        Injector._page(ArticlePage.class).setColor(color);
    }

    @When("acepta los terminos del servicio")
    public void aceptaTerminosDeServicio() {
        Injector._page(ShippingPage.class).acceptTerms();
    }

    @When("selecciona el metodo de pago (.*)")
    public void seleccionaMetodoDePago(String metodoPago) {
        Injector._page(PaymentMethodPage.class).clickPayButton(metodoPago);
    }


}
