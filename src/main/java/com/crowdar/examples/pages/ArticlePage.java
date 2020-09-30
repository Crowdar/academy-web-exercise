package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class ArticlePage extends PageBaseShop{

    public ArticlePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private String SELECT_SIZE_ID = "group_1";

    public void verifyArticlePage() {
        Assert.assertTrue(isPresent("article.a_write_review"),"El elemento no esta visible");
    }

    public void setQuantity(String cantidad){
        setInput("article.input_quantity",cantidad,false,true);
    }

    public void setSize(String talle){
        selectOptionDropdownByText(By.id(SELECT_SIZE_ID), talle);
    }

    public void setColor(String colorPedido){
        List<WebElement> listaColores = getElements("article.list_color");

        for(WebElement color:listaColores){
            if(color.getAttribute("name").toLowerCase().equals(colorPedido.toLowerCase())){
                color.click();
                break;
            }
        }
    }

    public void clickButton(String boton){
        switch (boton){
            case "Add to cart": clickAddToCart(); break;
            case "Proceed to checkout": clickProceedToCheckout();
        }
    }

    private void clickAddToCart(){
        click("article.button_add_to_cart",true);
    }

    private void clickProceedToCheckout(){
        click("article.button_proceed_to_checkout", false);
    }
}
