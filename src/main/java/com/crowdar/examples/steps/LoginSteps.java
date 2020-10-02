package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoadedService;
import io.cucumber.java.en.*;

public class LoginSteps extends PageSteps {

    @Given("The page loaded correctly")
    public void pageLoaded() {
        LoadedService.viewHome();
    }

    @When("the client clicks the (.*) button")
    public void clickSingInHome(){

    }


    @Then("(.*) page is displayed")
    public void homePageIsDisplayed() {
    }

    @When("The client logs in the application with: (.*), (.*)")
    public void theClientLogsInTheApplicationWithEmailPassword() {
    }

}
