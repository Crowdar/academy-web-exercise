package com.crowdar.examples.views;

import com.crowdar.examples.constants.ProductCte;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ProductView extends BaseView{

    public ProductView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Title":
                return ProductCte.H1_TITLE;
            case "Order Confirmation":
                return ProductCte.H1_ORDER_CONFIRMATION;
            case "Aumentar Cantidad":
                return ProductCte.BTN_AUMENTAR_CANTIDAD;
            case "Disminuir Cantidad":
                return ProductCte.BTN_DISMINUIR_CANTIDAD;
            case "Add To Cart":
                return ProductCte.BTN_ADD_TO_CART;
            case "Proceed To Checkout":
                return ProductCte.BTN_PROCEED_TO_CHECKOUT;
            case "Cantidad Total":
                return ProductCte.INPUT_CANTIDAD_TOTAL;
            case "Popup Proceed To Checkout":
                return ProductCte.POPUP_PROCEED_TO_CHECKOUT;
        }
        return "";
    }
}
