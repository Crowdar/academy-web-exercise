package com.crowdar.examples.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class MyAccountPage extends PageBaseShop {

    public MyAccountPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyMyAccountPage() {
        waitPresence("myaccount.h1_titlepage");
        Assert.assertEquals(getElement("myaccount.h1_titlepage").getText(), "MY ACCOUNT");
    }

    public void selectCategory(String categoriaElegida) {
        if (categoriaElegida.equals("T-SHIRTS")) {
                click("myaccount.a_tshirt");
        } else {
            if (categoriaElegida.equals("DRESSES")) {
                     click("myaccount.a_dresses");
            } else {
                if (categoriaElegida.equals("WOMEN")) {
                        click("myaccount.a_women");
                }
            }
        }
    }
}