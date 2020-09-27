package com.crowdar.examples.views;


import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseView extends PageBaseWeb {

    public BaseView(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://automationpractice.com/";
    }
    public void go() {
        navigateToCompleteURL();
    }


}

