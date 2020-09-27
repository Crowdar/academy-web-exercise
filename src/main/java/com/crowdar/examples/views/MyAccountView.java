package com.crowdar.examples.views;

import com.crowdar.examples.constants.MyAccountCte;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyAccountView extends BaseView {

    public MyAccountView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "T-Shirts":
                return MyAccountCte.BTN_T_SHIRTS;
            case "Title":
                return MyAccountCte.H1_TITLE;

        }
        return "";
    }
    public void metodo(){

    }
}
