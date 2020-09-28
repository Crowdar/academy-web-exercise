package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreMyAccountPage extends StorePageBase{

    public final String HEADING_MYACCOUNT_CSS_SELECTOR = "<h1 class=\"page-heading\">My account</h1>";

    public StoreMyAccountPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }

    public void VerifyMyAccountPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(HEADING_MYACCOUNT_CSS_SELECTOR)), "No se encontro la pagina");
    }
}
