package com.crowdar.examples.steps;


import com.crowdar.examples.services.BuyService;
import com.crowdar.examples.services.CommonService;
import io.cucumber.java.en.*;

public class NewBuySteps {

    @Given("The client is in home page")
    public void goHomePage() {
        CommonService.homePage();
    }

    @When("the client selects an product in active (.*)")
    public void selectsProduct(String tab) {
        BuyService.selectProduct(tab);
    }

    @Then("the client clicks  (.*) button")
    public void clickButton(String button) {
        BuyService.clickButton(button);

    }

    @When("product successfully added modal is displayed")
    public void addToCart() {
        BuyService.addToCart();
    }

    @When("the client check shipping (.*)")
    public void checkAddress(String address) {
         BuyService.checkAddress(address);
    }

    @When("the terms and conditions is displayed")
    public void acceptsTermsAndConditions() {
        BuyService.acceptsTermsAndConditions();
    }

    @When("the client verifies the buy price")
    public void checkPrice() {
        BuyService.checkPrice();
    }

    @Then("then the client selects payment method: (.*)")
    public void selectsPay(String pay) {
        BuyService.methodOfPayment(pay);
    }


}
