package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreHomePage extends StorePageBase {

    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String HOME_FEATURED_CSS_SELECTOR = "#home-page-tabs > li.active > a";
    private final String BUTTON_WOMEN_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(1) > a";
    private final String BUTTON_DRESSES_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(2) > a";
    private final String BUTTON_TSHIRTS_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(3) > a";

    public StoreHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go(){
        navigateToCompleteURL();
    }

    public void clickSignInButton(){
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
    }

    public void verifyHome(){
        Assert.assertTrue(isElementVisible(By.cssSelector(HOME_FEATURED_CSS_SELECTOR)), "no se encuentra la pagina");
    }
    public void clickCategoryButton(String p_category){
        switch (p_category){
            case "Women":
                clickElement(By.cssSelector(BUTTON_WOMEN_CSS_SELECTOR));
                break;
            case "Dresses":
                clickElement(By.cssSelector(BUTTON_DRESSES_CSS_SELECTOR));
                break;
            case "T-Shirts":
                clickElement(By.cssSelector(BUTTON_TSHIRTS_CSS_SELECTOR));
                break;
        }
    }
}
