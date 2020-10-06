package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.CommonService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.*;


public class LoginSteps extends PageSteps {

    @Given("The client is in shopp page")
    public void goShoppPage() {
        CommonService.homePage();
    }

    @When("The client logs in the application with: (.*), (.*)")
    public void inputLogin(String email, String password) {
        WebActionManager.click(HomeConstants.SIGN_IN_HOME_LOCATOR);
        LoginService.inputLogin(email, password);
    }

    @Then("the client submits the form")
    public void submitFormLogin() {

        LoginService.submitFormLogin();
    }
}
