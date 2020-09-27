package com.crowdar.examples.views;

import com.crowdar.examples.constants.HomeCte;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeView extends BaseView {

    public HomeView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Sign In":
                return HomeCte.BTN_SIGN_IN;
            case "Slider":
                return HomeCte.SLIDER_HOME;
            case "Title":
                return HomeCte.H1_TITLE;

        }
        return "";
    }
}
