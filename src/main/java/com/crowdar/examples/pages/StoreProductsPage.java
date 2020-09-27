package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreProductsPage extends PageBaseStore {
	// home
	private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
	// login
	private final String BUTTON_SIGNIN_ID = "SubmitLogin";
	private final String ACCOUNT_INFO_MESSAGE = ".//p[@class='info-account']";
	// buy
	private final String T_SHIRTS_BUTTON = "#my-account >div#page>div>#header>div>div>div>#block_top_menu>ul>li:nth-child(3)>a";
	private final String ADD_TO_CART = "div>#center_column>ul>li>div>div>div>a.button.ajax_add_to_cart_button.btn.btn-default";
	private final String T_SHIRTS_TITLE = ".//span[text()[contains(.,'T-shirts ')]]";
	private final String ADDED_MODAL_VISIBLE = ".//div[@id='layer_cart'][contains(@style,'display: block')]";
	private final String PROCEED_CHECKOUT_ADDED_BUTTON = "div#layer_cart>div.clearfix>div.layer_cart_cart>div.button-container>a";
	private final String SUMMARY_TITLE = ".//h1[@id='cart_title']";
	private final String PROCEED_CHECKOUT_SUMMARY_BUTTON = "div>#columns>div>#center_column>p>a";
	private final String ADDRESS_TITLE = ".//label[@for='id_address_delivery']";
	private final String PROCEED_CHECKOUT_ADDRESS_BUTTON = ".//button[@name='processAddress']";
	private final String SHIPPING_TITLE = ".//h1[text()= 'Shipping'][@class='page-heading']";
	private final String SHIPPING_AGREE_CHECKBOX = ".//label[@for= 'cgv']";
	private final String PROCEED_CHECKOUT_SHIPPING_BUTTON = ".//button[@name='processCarrier']";
	private final String PAY_BANK_WIRE_BUTTON = ".//a[@class= 'bankwire'][@title='Pay by bank wire']";
	private final String ORDER_SUMMARY_TITLE = ".//h1[normalize-space(text())='Order confirmation'][@class='page-heading']";
	private final String CONFIRM_ORDER_BUTTON = ".//span[normalize-space(text())='I confirm my order']/ancestor::button";
	private final String PAYMENT_TITLE = ".//span[text()[contains(.,'Your payment method')]]";
	private final String BANK_WIRE_TITLE = ".//span[text()[contains(.,'    Bank-wire payment.')]]";

	private int orderProceedWizard = 0;
	private int orderSignIn = 0;

	@SuppressWarnings("deprecation")
	public StoreProductsPage(RemoteWebDriver driver) {
		super(driver);
		this.url = ""; // here you can define the custom paths For example:"/search" -->
						// www.googe.com/search
	}
	

	@SuppressWarnings("deprecation")
	public void clickButton(String button) {
		System.out.println("boton presionado: " + button);
		switch (button) {
		case ("Sign In"): {
			if (this.orderSignIn == 0) {
				this.orderSignIn++;
				clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
			} else if (this.orderSignIn == 1) {
				clickElement(By.id(BUTTON_SIGNIN_ID));
			}

			break;
		}
		case ("T-Shirts"): {
			clickElement(By.cssSelector(T_SHIRTS_BUTTON));
			break;
		}
		case ("Add to cart"): {
			try {
				Actions actions = new Actions(driver); // hover
				WebElement addProduct = driver.findElement(By.xpath(".//div[@class='product-container']/ancestor::li"));
				actions.moveToElement(addProduct).perform();
				System.out.println("HOVER producto");
				
				WebElement addButton = driver.findElement(By.cssSelector(ADD_TO_CART));
				actions.moveToElement(addButton);
				actions.click().build().perform();

				System.out.println("CLICK: " + button);
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
			}

			break;
		}
		case ("I agree to the terms"): {
			clickElement(By.xpath(SHIPPING_AGREE_CHECKBOX));
			break;
		}
		case ("Pay by bank wire"): {
			clickElement(By.xpath(PAY_BANK_WIRE_BUTTON));
			break;
		}
		case ("I confirm my order"): {
			clickElement(By.xpath(CONFIRM_ORDER_BUTTON));
			break;
		}
		default:
			break;
		}
	}

	@SuppressWarnings("deprecation")
	public void clickProceedCheckoutButton() {
		this.orderProceedWizard++; // suma a medida que se llama el metodo para pasar por todas las pantallas en
									// orden
		System.out.println("orden de flujo para wizard: " + this.orderProceedWizard);
		switch (this.orderProceedWizard) {
		case (1): {
			clickElement(By.cssSelector(PROCEED_CHECKOUT_ADDED_BUTTON));
			break;
		}
		case (2): {
			clickElement(By.cssSelector(PROCEED_CHECKOUT_SUMMARY_BUTTON));
			break;
		}
		case (3): {
			clickElement(By.xpath(PROCEED_CHECKOUT_ADDRESS_BUTTON));
			break;
		}
		case (4): {
			clickElement(By.xpath(PROCEED_CHECKOUT_SHIPPING_BUTTON));
			break;
		}
		default:
			break;
		}
	}

	@SuppressWarnings("deprecation")
	public void verifyPantalla(String pantalla) {
		System.out.println("pantalla : " + pantalla);
		switch (pantalla) {
		case ("My Account"): {
			Assert.assertTrue(isElementVisible(By.xpath(ACCOUNT_INFO_MESSAGE)));
			break;
		}
		case ("T-Shirts"): {

			Assert.assertTrue(isElementVisible(By.xpath(T_SHIRTS_TITLE)));
			break;
		}
		case ("Product Succesfully Added"): {
			Assert.assertTrue(isElementVisible(By.xpath(ADDED_MODAL_VISIBLE)));
			break;
		}
		case ("Summary"): {
			Assert.assertTrue(isElementVisible(By.xpath(SUMMARY_TITLE)));
			break;
		}
		case ("Address"): {
			Assert.assertTrue(isElementVisible(By.xpath(ADDRESS_TITLE)));
			break;
		}
		case ("Shipping"): {
			Assert.assertTrue(isElementVisible(By.xpath(SHIPPING_TITLE)));
			break;
		}
		case ("Payment"): {
			Assert.assertTrue(isElementVisible(By.xpath(PAYMENT_TITLE)));
			break;
		}
		case ("Bank-wire payment"): {
			Assert.assertTrue(isElementVisible(By.xpath(BANK_WIRE_TITLE)));
			break;
		}
		case ("Order confirmation"): {
			Assert.assertTrue(isElementVisible(By.xpath(ORDER_SUMMARY_TITLE)));
			break;
		}
		default:
			break;
		}
	}

}
