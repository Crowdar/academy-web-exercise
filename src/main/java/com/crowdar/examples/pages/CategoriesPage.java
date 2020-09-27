package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class CategoriesPage extends PageBaseShop {
    public CategoriesPage(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    private final String CATEGORY_TITLE_CSS_SELECTOR ="#center_column > div.content_scene_cat > div > div > span";
    private final String ALL_PRODUCTS_ON_THE_PAGE_CSS_SELECTOR ="#center_column > ul > li > div > div.right-block > h5 > a";

    public void verifyCategoriPage(String page){
        Assert.assertEquals(getWebElement(By.cssSelector(CATEGORY_TITLE_CSS_SELECTOR)).getText(),page);
    }

    public void selectRandomProduct(){
        List<WebElement> products = getWebElements(By.cssSelector(ALL_PRODUCTS_ON_THE_PAGE_CSS_SELECTOR));
        Random random = new Random();
        int size = products.size();
        clickElement(products.get(random.nextInt(size)));
    }
}
