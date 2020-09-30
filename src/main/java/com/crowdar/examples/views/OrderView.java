package com.crowdar.examples.views;

import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class OrderView extends BaseView {
    private ArrayList<String> orders = new ArrayList<>();

    public OrderView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }
    public void verifyScreen(){
        Assert.assertTrue(existenciaEnOrders());
    }
    public boolean existenciaEnOrders(){
        cargarOrders();
        return orders.contains(WebActionManager.getText(OrderView.searchLocator("Navigation Page")));
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

            case "Pay By Bank Wire":
                return "OrderView.btnPayBankWire";

            case "Pay By Check":
                return "OrderView.btnPayCheck";

            case "I Confirm My Order":
                return "OrderView.btnConfirmMyOrder";

            case "Terms Of Service":
                return "OrderView.checkboxTOS";

            default:
                throw new IllegalStateException("Valor no esperado: " + elemento);
        }
    }
    public void cargarOrders(){
        orders.clear();
        orders.add("Order");
        orders.add("Order confirmation");


    }
}