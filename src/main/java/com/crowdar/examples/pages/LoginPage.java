package com.crowdar.examples.pages;

import com.crowdar.core.PageSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LoginPage extends PageBaseStore {

    public LoginPage (RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String PASS_INPUT_CSS_SELECTOR = "#passwd";

    public void setPass(String pass){
        completeField(By.cssSelector(PASS_INPUT_CSS_SELECTOR), pass);
    }

}
