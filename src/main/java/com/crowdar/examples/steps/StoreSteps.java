package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.StoreHomePage;
import com.crowdar.examples.pages.StoreLoginPage;
import com.crowdar.examples.pages.StoreProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StoreSteps extends PageSteps {

	// From principal page to login

	@Given("El cliente se encuentra en la pantalla (.*)")
	public void verifyIsInScreen(String screen) {
		switch (screen) {
		case "Home": {
			Injector._page(StoreHomePage.class).go();
			break;
		}
		case "My Account": {
			Injector._page(StoreProductsPage.class).verifyPantalla(screen);
			break;
		}
		}
	}
	
	@Then("El cliente puede ver mensaje de (.*)")
	public void verifyResultLogin(String result) {
		Injector._page(StoreLoginPage.class).verifyResultLogin(result);
	}

	// From login page to account
	@When("El cliente ingresa su (.*): (.*)")
	public void inputLoginData(String type ,String email) {
		Injector._page(StoreLoginPage.class).completeLoginInfo(type, email);
	}

//	@And("El cliente ingresa su password: (.*)")
//	public void inputPassword(String password) {
//		Injector._page(StoreLoginPage.class).completeLoginInfo(password);
//	}

	// From account page to t-shirt
	@When("El cliente verifica que fue redireccionado a la pantalla (.*)")
	public void getAccountPageStateToBuy(String screen) {
		Injector._page(StoreProductsPage.class).verifyPantalla(screen);
	}

	@And("El cliente clickea sobre el botón (.*)")
	public void clickButton(String button) {
		Injector._page(StoreProductsPage.class).clickButton(button);
	}

	@And("El cliente clickea sobre Proceed to checkout")
	public void clickProceedCheckout() {
		Injector._page(StoreProductsPage.class).clickProceedCheckoutButton();
	}

}
