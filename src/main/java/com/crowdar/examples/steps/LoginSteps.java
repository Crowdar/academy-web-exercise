package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClickElementService;
import com.crowdar.examples.services.LoadedService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.*;

public class LoginSteps extends PageSteps {

    @Given("The page loaded correctly")
    public void pageLoaded() {
        LoadedService.viewHome();
    }

    @When("the client clicks the (.*) button")
    public void clickSingInHome(String element) {
        ClickElementService.clickSingInHome(element);
    }

    @Then("(.*) page is displayed")
    public void homeDisplayed() {
    }

    @When("The client logs in the application with: (.*), (.*)")
    public void inputLogin(String email, String password) {
        LoginService.inputLogin(email,password);
    }


}
