package com.crowdar.examples.views;

import org.openqa.selenium.remote.RemoteWebDriver;

public class MyAccountView extends BaseView {

    public MyAccountView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "T-Shirts":
                return "MyAccount.btnTShirts";
            case "Title":
                return "MyAccount.h1Title";

        }
        return "";
    }
}
