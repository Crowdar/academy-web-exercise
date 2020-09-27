package com.crowdar.examples.views;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.LoginCte;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginView extends BaseView {

    public LoginView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "Sign In":
                return LoginCte.BTN_SIGN_IN;
            case "Slider":
                return LoginCte.SLIDER_HOME;
            case "Title":
                return LoginCte.H1_TITLE;
            case "Email Sign In":
                return LoginCte.INPUT_EMAIL_SIGN_IN;
            case "Email Sign Up":
                return LoginCte.INPUT_EMAIL_SIGN_UP;
            case "Password":
                return LoginCte.INPUT_PASSWORD;
            case "Create Account":
                return LoginCte.BTN_CREATE_ACCOUNT;
        }
        return "";
    }
}
