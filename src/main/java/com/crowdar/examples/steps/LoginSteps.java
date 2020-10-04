package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.services.CommonService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.*;


public class LoginSteps extends PageSteps {

    @Given("The client is in shopp page")
    public void goShoppPage() {
        WebActionManager.navigateTo("http://automationpractice.com/");
    }

    @When("(.*) page is displayed")
    public void pageLoaded(String page) {
        CommonService.displayedPage(page);
    }

    @Then("the client clicks the (.*) button")
    public void singIn(String button) {
        CommonService.signIn(button);
    }

    @When("The client logs in the application with: (.*), (.*)")
    public void inputLogin(String email, String password) {
        LoginService.inputLogin(email, password);
    }

    @Then("the form login is visible")
    public void formLoginVisible() {
        LoginService.displayForm();
    }

    @Then("the client submits the form")
    public void submitFormLogin() {
        LoginService.submitFormLogin();
    }
}
