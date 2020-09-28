package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StoreHomePage extends StorePageBase {

    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";


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
}
