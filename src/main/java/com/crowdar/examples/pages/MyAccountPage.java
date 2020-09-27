package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class MyAccountPage extends PageBaseShop {

    public MyAccountPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";
    private final String WOMEN_BUTTON_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(1) > a";
    private final String DRESSES_BUTTON_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(2) > a";
    private final String T_SHIRTS_BUTTON_CSS_SELECTOR ="#block_top_menu > ul > li:nth-child(3) > a";

    public void verifyMyAccountPage() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"MY ACCOUNT");
    }

    public void clicks(String button){
        switch (button){
            case "Women" :
                clickElement(By.cssSelector(WOMEN_BUTTON_CSS_SELECTOR));
                break;
            case "Dresses" :
                clickElement(By.cssSelector(DRESSES_BUTTON_CSS_SELECTOR));
                break;
            case "T-shirts" :
                clickElement(By.cssSelector(T_SHIRTS_BUTTON_CSS_SELECTOR));
                break;
        }
    }

}
