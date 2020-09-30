package com.crowdar.examples.views;

import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CategoriesView extends BaseView{
    private static ArrayList<String> categorias = new ArrayList<>();

    public CategoriesView(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public void verifyScreen(String pantalla){
        Assert.assertTrue(existenciaEnCategorias());
        Assert.assertEquals(WebActionManager.getText(CategoriesView.searchLocator("Title")), String.format("%s ",pantalla.toUpperCase()));
    }
    public boolean existenciaEnCategorias(){
        cargarCategorias();
        return categorias.contains(WebActionManager.getText(CategoriesView.searchLocator("Title")));
    }
    public static void cargarCategorias(){
        categorias.clear();
        categorias.add("WOMEN ");
        categorias.add("DRESSES ");
        categorias.add("T-SHIRTS ");
        categorias.add("CASUAL DRESSES ");
        categorias.add("EVENING DRESSES ");
        categorias.add("SUMMER DRESSES ");
        categorias.add("TOPS ");
        categorias.add("BLOUSES ");

    }


    public static String searchLocator(String elemento){
        switch (elemento){
            case "Title":
                return "CategoriesView.h1Title";

            case "Women":
                return "CategoriesView.btnWomen";

            case "Dresses":
                return "CategoriesView.btnDresses";

            case "T-Shirts":
                return "CategoriesView.btnTShirts";

            case "Del primer artículo":
                return "CategoriesView.txtPrimerArticulo";

            case "Proceed To Checkout":
                return "CategoriesView.btnProceedToCheckout";

            case "Pop Up":
                return "CategoriesView.divPopUpAgregarCarrito";

            case "Sub categoría Tops":
                return "CategoriesView.btnWomenSubcategoryTops";

            case "Sub categoría T-Shirts":
                return "CategoriesView.btnTopsSubcategoryTShirts";
            default:
                throw new IllegalStateException("Valor no esperado: " + elemento);
        }
    }
    public static String revisarSiCategory(String pantalla){
        cargarCategorias();
        if (categorias.contains(String.format("%s ",pantalla.toUpperCase()))){
            return "Categoria";
        }
        return pantalla;
    }

    public void elegirItem(String item) {
        List<WebElement> lista = WebActionManager.getElements("CategoriesView.listItems");
        String nombreProducto;

        for (WebElement elemento : lista){
            nombreProducto = elemento.findElement(By.className("product-name")).getText();

            if (nombreProducto.equalsIgnoreCase(item)){
                elemento.findElement(By.className("product-name")).click();
                break;
            }
        }
    }
}
