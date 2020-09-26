package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class LoginPage extends PageBaseShop {

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyLoginPage(){
        waitPresence("login.h3_title_form");

        Assert.assertEquals(getText("login.h3_title_form"), "ALREADY REGISTERED?");
    }

    public void completeEmailPass(String email, String pass){
        setInput("login.input_email",email, true);
        setInput("login.input_pass",pass, true);
    }

    public void clickBotonSignIn(){
        if(isPresent("login.button_signin") && isPresent("home.button_sign_in")){
            click("login.button_signin", false);
        } else {
            Injector._page(HomePage.class).clickBotonSignIn();
        }
    }
}
