package com.crowdar.examples.services;

import com.crowdar.core.Utils;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.*;
import org.openqa.selenium.WebElement;

import java.util.Random;

import static com.crowdar.core.actions.WebActionManager.*;

public class BuyService {

    private static int popularMin = 0;
    private static int popularMax = 6;
    private static int bsMin = 7;
    private static int bsMax = 13;

    private static String initPrice;
    WebElement pScroll = WebActionManager.getElement(SummaryConstants.ELEMENT_SCROLL_LOCATOR);


    public static void loggedInHomePage() {
        CommonService.homePage();

        LoginService.inputLogin("lindacristal.parrasanhueza@gmail.com", "Testing29");
        LoginService.submitFormLogin();
        CommonService.homePage();
    }


    public static void selectProduct(String tabName) {
        WebElement tabToActive = null;
        int index;
        Random random = new Random();

        if (tabName.equals("Popular")) {
            tabToActive = getElement(HomeConstants.TAB_POPULAR_HOME_LOCATOR);
            index = random.ints(popularMin, popularMax).findFirst().getAsInt();
        } else {
            tabToActive = getElement(HomeConstants.TAB_BS_HOME_LOCATOR);
            index = random.ints(bsMin, bsMax).findFirst().getAsInt();
        }
        tabToActive.click();

        WebElement product = getElements(HomeConstants.PRODUCT_HOME_LOCATOR).get(index);
        CommonService.scroll(product);

        String urlProduct = product.getAttribute("href");
        navigateTo(urlProduct);

    }

    public static void completeBuyout(String pay) {

        WebElement price = getElement(ProductConstants.PRICE_LOCATOR);
        initPrice = price.getText();
        CommonService.scroll(price);
        clickButton("Add to cart");
        goSummary();
        goSignIn();
        goAddress();
        goShipping();
        goPayment(pay);
    }


    public static void clickButton(String button) {
        switch (button) {
            case "Add to cart":
                click(ProductConstants.ADD_BUTTON_LOCATOR);
                break;
            case "checkout modal":
                click(ModalAddToCartConstants.CHECKOUT_BUTTON_CART_LOCATOR);
                break;
            case "go signin":
                click(SummaryConstants.GO_LOGIN_BUTTON_LOCATOR);
                break;
            case "go shipping":
                click(SummaryConstants.GO_SHIPPING_BUTTON_LOCATOR);
                break;

            case "go payment":
                click(SummaryConstants.GO_PAYMENT_LOCATOR);
                break;
            case "bank":
                click(SummaryConstants.PAY_BANK_LOCATOR);
                break;
            case "check":
                click(SummaryConstants.PAY_CHECK_LOCATOR);
                break;
            case "confirm":
                click(SummaryConstants.CONFIRM_BUTTON_LOCATOR);
                break;
            default:
                System.out.println("Button not found");
        }
    }


    public static void goSummary() {
        clickButton("checkout modal");

    }

    public static void goSignIn() {
        clickButton("go signin");
        LoginService.inputLogin("lindacristal.parrasanhueza@gmail.com", "Testing29");
        WebActionManager.click(LoginConstants.BUTTON_LOGIN_FORM_LOCATOR);

    }

    public static void goAddress() {
        clickButton("go shipping");
    }

    public static void goShipping() {
        WebElement checkbox = WebActionManager.getElement(SummaryConstants.CHECKBOX_SHIPPING_LOCATOR);
        checkbox.isEnabled();
        checkbox.click();
        clickButton("go payment");
    }

    public static void goPayment(String paySelect) {
        if (checkPrice()) {
            clickButton(paySelect);
            clickButton("confirm");
            WebActionManager.isVisible(SummaryConstants.ORDER_LOCATOR);
        }
    }


    public static boolean checkPrice() {
        boolean staticPrice = false;
        WebElement price = getElement(SummaryConstants.PRICE_PRODUCT_BUY_LOCATOR);
        String finPrice = price.getText();

        if (CommonService.constantPrice(finPrice, initPrice))
            staticPrice = true;
        return staticPrice;

    }


}

