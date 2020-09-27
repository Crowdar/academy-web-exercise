package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
//import com.crowdar.examples.views.SignInPage;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.views.LoginView;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginSteps extends PageSteps {

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmail(String email) {
        WebActionManager.setInput(LoginView.searchLocator("Email Sign In"), email);
        WebActionManager.setInput(LoginView.searchLocator("Email Sign Up"), email);
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPassword(String pw) {
        WebActionManager.setInput(LoginView.searchLocator("Password"), pw);
    }
}
