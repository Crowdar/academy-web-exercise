package com.crowdar.examples.views;

import com.crowdar.examples.constants.OrderCte;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OrderView extends BaseView {

    public OrderView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Navigation Page":
                return OrderCte.NAVIGATION_PAGE;
            case "Checkout Para Address":
                return OrderCte.BTN_PROCEED_TO_CHECKOUT_TO_ADDRESS;
            case "Checkout Para Shipping":
                return OrderCte.BTN_PROCEED_TO_CHECKOUT_TO_SHIPPING;
            case "Checkout Para Payment":
                return OrderCte.BTN_PROCEED_TO_CHECKOUT_TO_PAYMENT;
            case "Pay Ban Wire":
                return OrderCte.BTN_PAY_BANK_WIRE;
            case "Confirm My Order":
                return OrderCte.BTN_CONFIRM_MY_ORDER;
            case "Terminos y condiciones":
                return OrderCte.CHECKBOX_TOS;

        }
        return "";
    }
}