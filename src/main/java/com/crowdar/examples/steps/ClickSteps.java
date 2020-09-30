package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.views.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ClickSteps extends PageSteps {
    @When("el cliente hace click en el botón (.*) de la página (.*)")
    public void elClienteHaceClickEnElBotónSignIn(String btn, String pantalla)  {
        pantalla = CategoriesView.revisarSiCategory(pantalla);
        switch (pantalla){
            case "Home":
                WebActionManager.click(HomeView.searchLocator(btn));
                break;
            case "Login":
                WebActionManager.click(LoginView.searchLocator(btn));
                break;
            case "My Account":
                WebActionManager.click(MyAccountView.searchLocator(btn));
                break;
            case "Categoria":
                WebActionManager.click(CategoriesView.searchLocator(btn));
                break;
            case "Producto":
                WebActionManager.click(ProductView.searchLocator(btn));
                break;
            case "Order":
                WebActionManager.click(OrderView.searchLocator(btn));
                break;
            default:
                throw new IllegalStateException("Valor no esperado: " + pantalla);
        }

    }
    @And("hace click en el botón (.*) de la página (.*)")
    public void elClienteHaceClickEnElBotón(String btn, String pantalla)  {
        elClienteHaceClickEnElBotónSignIn(btn, pantalla);
    }

}
