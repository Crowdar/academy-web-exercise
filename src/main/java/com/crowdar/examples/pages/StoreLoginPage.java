package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class StoreLoginPage extends StorePageBase {

    public final String H1_LOGIN_CSS_SELECTOR = "#center_column > h1";
    public final String EMAIL_LOGIN_CSS_SELECTOR ="#email";
    public final String PASSWORD_LOGIN_CSS_SELECTOR ="#passwd";
    public final String BUTTON_SIGNIN_CSS_SELECTOR ="#SubmitLogin > span";

    public StoreLoginPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    public void verifyLogin(){
        Assert.assertTrue(isElementVisible(By.cssSelector(H1_LOGIN_CSS_SELECTOR)), "No Se Encontró la Pagina");
    }

    public void completeEmail(String p_email){
        completeField(By.cssSelector(EMAIL_LOGIN_CSS_SELECTOR), p_email);
    }

    public void completePassword(String p_password){
        completeField(By.cssSelector(PASSWORD_LOGIN_CSS_SELECTOR), p_password);
    }

    public void clickButtonSignIn() {
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
    }



}
