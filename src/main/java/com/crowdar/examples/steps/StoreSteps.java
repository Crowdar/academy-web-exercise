package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.StoreHomePage;
import com.crowdar.examples.pages.StoreLoginPage;
import com.crowdar.examples.pages.StoreMyAccountPage;
import com.crowdar.examples.pages.StoreCategoryPage;
import io.cucumber.java.en.*;

public class StoreSteps extends PageSteps {

    @Given("El cliente se encuentra en la pantalla de home")
    public void elClienteSeEncuentraEnLaPantallaDeHome() {
        Injector._page(StoreHomePage.class).go();
    }

    @When("El cliente hace click en el boton sign in")
    public void elClienteHaceClickEnElBotonSignIn() {
        Injector._page(StoreHomePage.class).clickSignInButton();
    }

    @Then("El cliente verifica que fue redireccionado a la pagina de Login")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaDeLogin() {
        Injector._page(StoreLoginPage.class).verifyLogin();
    }

    @When("El cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmail(String email) {
        Injector._page(StoreLoginPage.class).completeEmail(email);
    }

    @And("El cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPassword(String password) {
        Injector._page(StoreLoginPage.class).completePassword(password);
    }

    @And("El cliente hace click en el boton: sign in verde")
    public void elClienteHaceClickEnElBotonSignInVerde() {
        Injector._page(StoreLoginPage.class).clickButtonSignIn();
    }

    @Then("El cliente verifica que fue redireccionado a la pantalla de My Account")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeMyAccount() {
        Injector._page(StoreMyAccountPage.class).VerifyMyAccountPage();
    }

    @When("El cliente hace click en el boton home")
    public void elClienteHaceClickEnElBotonHome() {
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
     /*   Injector._page(StoreCategoryPage.class).verifyPage();*/
    }

    @And("El cliente elije un producto del listado")
    public void elClienteElijeUnProductoDelListado() {
      Injector._page(StoreCategoryPage.class).selectProduct();

    }

    @Then("El cliente hace click en el boton add to card")
    public void elClienteHaceClickEnElBotonAddToCard() {
    }


}
