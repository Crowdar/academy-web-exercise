package com.crowdar.examples.steps;

import com.crowdar.examples.services.BuyService;
import com.crowdar.examples.services.CommonService;
import io.cucumber.java.en.*;

public class BuySteps {

    @Given("the client is in the home page")
    public void loggedInHomePage() {
        CommonService.homePage();

    }

    @When("the client selects an product in active (.*)")
    public void selectsProduct(String tab) {
        BuyService.selectProduct(tab);
    }

    @Then("the client completes the buy process with the payment method:(.*)")
    public void completeBuyMethodPay(String pay) {
        BuyService.completeBuyout(pay);

    }
}
