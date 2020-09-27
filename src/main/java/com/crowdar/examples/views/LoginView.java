package com.crowdar.examples.views;

import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginView extends BaseView {

    public LoginView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Sign In":
                return "LoginView.btnSignIn";

            case "Slider":
                return "LoginView.sliderHome";

            case "Title":
                return "LoginView.h1Title";

            case "Email Sign In":
                return "LoginView.inputEmailSignIn";

            case "Email Sign Up":
                return "LoginView.inputEmailRegister";

            case "Password":
                return "LoginView.inputPw";

            case "Create Account":
                return "LoginView.btnCreateAccount";
        }
        return "";
    }
}
