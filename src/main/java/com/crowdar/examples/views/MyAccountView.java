package com.crowdar.examples.views;

import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class MyAccountView extends BaseView {

    public MyAccountView(RemoteWebDriver driver){
        super(driver);
        this.url = "";
    }
    public void verifyScreen(){
        Assert.assertEquals(WebActionManager.getText(MyAccountView.searchLocator("Title")),
                "MY ACCOUNT");
    }

    public static String searchLocator(String elemento){
        switch (elemento){
            case "T-Shirts":
                return "MyAccount.btnTShirts";

            case "Women":
                return "MyAccount.btnWomen";

            case "Dresses":
                return "MyAccount.btnDresses";

            case "Title":
                return "MyAccount.h1Title";

            default:
                throw new IllegalStateException("Valor no esperado: " + elemento);
        }
    }
}
