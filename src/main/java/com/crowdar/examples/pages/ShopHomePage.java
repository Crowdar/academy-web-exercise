package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ShopHomePage extends PageBaseShop {



    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";

    public void go (){
        navigateToCompleteURL();
    }


    public void clicks(String button){
        switch (button){
            case "Sign in" :
                clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
            break;
        }
    }

}
