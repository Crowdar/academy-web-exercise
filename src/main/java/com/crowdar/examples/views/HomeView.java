package com.crowdar.examples.views;

import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeView extends BaseView {

    public HomeView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Sign In":
                return "HomeView.btnSignIn";

            case "Slider":
                return "HomeView.h1Title";

            case "Title":
                return "HomeView.sliderHome";
        }
        return "";
    }
}
