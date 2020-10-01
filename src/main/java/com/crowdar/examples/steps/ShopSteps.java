package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {




    @Given("el cliente se encuentra en la página de home")
    public void elClienteSeEncuentraEnLaPágina() {
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verificarHome();

    }
    @When("el cliente hace click en el botón (.*)")
    public void elClienteHaceClickEnElBotón(String button) {

        Injector._page(ShopHomePage.class).clickButton(button);
    }

    @When("el cliente ingresa su email:(.*)")
    public void elClienteIngresaSuEmailDireccionfalsaLiveCom(String email) {
        Injector._page(ShopHomePage.class).enterEmail(email);
    }

    @And("el cliente ingresa su password:(.*)")
    public void elClienteIngresaSuPassword(String pass) {
        Injector._page(ShopHomePage.class).setPassword(pass);
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantalla(String pantalla) {
        Injector._page(ShopHomePage.class).redirectScreen(pantalla);

    }




}
