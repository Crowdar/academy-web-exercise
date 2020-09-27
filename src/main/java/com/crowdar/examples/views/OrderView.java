package com.crowdar.examples.views;

import org.openqa.selenium.remote.RemoteWebDriver;

public class OrderView extends BaseView {

    public OrderView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Navigation Page":
                return "OrderView.spanNavigationPage";
            case "Checkout Para Address":
                return "OrderView.btnProceedToCheckoutToAddress";
            case "Checkout Para Shipping":
                return "OrderView.btnProceedToCheckoutToShipping";
            case "Checkout Para Payment":
                return "OrderView.btnProceedToCheckoutToPayment";
            case "Pay Ban Wire":
                return "OrderView.btnPayBankWire";
            case "Confirm My Order":
                return "OrderView.btnConfirmMyOrder";
            case "Terminos y condiciones":
                return "OrderView.checkboxTOS";

        }
        return "";
    }
}