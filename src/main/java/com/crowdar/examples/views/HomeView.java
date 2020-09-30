package com.crowdar.examples.views;


import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class HomeView extends BaseView {

    public HomeView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }

    public void verifyScreen(){
        Assert.assertEquals(WebActionManager.getText(HomeView.searchLocator("Title")),
                "Automation Practice Website");
    }
    public static String searchLocator(String elemento){
        switch (elemento){
            case "Sign In":
                return "HomeView.btnSignIn";

            case "Title":
                return "HomeView.h1Title";

            case "Slider":
                return "HomeView.sliderHome";
            default:
                throw new IllegalStateException("Valor no esperado: " + elemento);
        }
    }
}
