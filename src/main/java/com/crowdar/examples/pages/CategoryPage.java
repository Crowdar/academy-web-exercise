package com.crowdar.examples.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class CategoryPage extends PageBaseShop {

    public CategoryPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyCategoryPage(String categoria) {
        if (categoria.toUpperCase().equals("WOMEN")) {
            Assert.assertEquals(getText("category.span_categoryname"), "Women");
        } else {
            if (categoria.toUpperCase().equals("DRESSES")) {
                Assert.assertEquals(getText("category.span_categoryname"), "Dresses");
            } else {
                if (categoria.toUpperCase().equals("T-SHIRTS")) {
                    Assert.assertEquals(getText("category.span_categoryname"), "T-shirts");
                }
            }
        }
    }

    public void selectArticle(String nombreArticulo){
        List<WebElement> listaArticulos = getElements("category.ul_productlist");

        for(WebElement articulo:listaArticulos){
            if(articulo.getAttribute("title").equals(nombreArticulo)){
                articulo.click();
                break;
            }
        }
    }


}