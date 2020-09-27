package com.crowdar.examples.views;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ProductView extends BaseView{

    public ProductView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Title":
                return "ProductView.h1Title";

            case "Order Confirmation":
                return "ProductView.h1OrderConfirmation";

            case "Aumentar Cantidad":
                return "ProductView.btnAumentarCantidad";

            case "Disminuir Cantidad":
                return "ProductView.btnDisminuirCantidad";

            case "Add To Cart":
                return "ProductView.btnAddToCart";

            case "Proceed To Checkout":
                return "ProductView.btnProceedToCheckout";

            case "Cantidad Total":
                return "ProductView.inputCantidadTotal";

            case "Popup Proceed To Checkout":
                return "ProductView.popUpProceedToCheckout";

        }
        return "";
    }
}
