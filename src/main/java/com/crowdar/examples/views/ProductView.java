package com.crowdar.examples.views;

import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class ProductView extends BaseView{
    private ArrayList<String> productos = new ArrayList<>();

    public ProductView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }
    public void verifyScreen(){
        Assert.assertTrue(existenciaEnProductos());
    }
    public boolean existenciaEnProductos(){
        cargarProductos();
        return productos.contains(WebActionManager.getText(CategoriesView.searchLocator("Title")));
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

            default:
                throw new IllegalStateException("Valor no esperado: " + elemento);
        }
    }

    public void cargarProductos(){
        productos.clear();
        productos.add("Faded Short Sleeve T-shirts");
        productos.add("Blouse");
        productos.add("Printed Dress");
        productos.add("Printed Summer Dress");
        productos.add("Printed Chiffon Dress");

    }

    public void ingresarCantidad(String cantidad) {
        WebActionManager.getElement("ProductView.inputCantidadTotal").clear();
        WebActionManager.setInput( "ProductView.inputCantidadTotal", cantidad);
    }
}
