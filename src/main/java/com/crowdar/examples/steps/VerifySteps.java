package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.views.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifySteps extends PageSteps {
    @Given("el cliente se encuentra en la página (.*)")
    public void elClienteSeEncuentraEnLaPáginaHome(String pantalla) {
        Injector._page(HomeView.class).go();
        Injector._page(HomeView.class).verifyScreen();
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(String pantalla) {
        switch (pantalla){
            case "Login":
                Injector._page(LoginView.class).verifyScreen();
                break;
            case "My Account":
                Injector._page(MyAccountView.class).verifyScreen();
                break;
            case "Casual Dresses":
            case "Evening Dresses":
            case "Summer Dresses":
            case "Tops":
            case "Blouses":
            case "Dresses":
            case "Women":
            case "T-Shirts":
                Injector._page(CategoriesView.class).verifyScreen(pantalla);
                break;
            case "Producto":
                Injector._page(ProductView.class).verifyScreen();
                break;
            case "Order":
            case "Order Confirmation":
                Injector._page(OrderView.class).verifyScreen();
                break;

            default:
                throw new IllegalStateException("Valor no esperado: " + pantalla);
        }

    }
}
