package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class SignInPage extends PageBaseShop {


    public SignInPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    private final String PASSWORD_BOX_CSS_SELECTOR = "#passwd";
    private final String EMAIL_BOX_CSS_SELECTOR = "#email";
    private final String BUTTON_SIGNIN_GREEN_CSS_SELECTOR = "#SubmitLogin";
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";


    public void verifySignIn(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"AUTHENTICATION");
    }

    public void setTextsBoxs(String box,String text){
        switch (box){
            case "email":
                completeField(getWebElement(By.cssSelector(EMAIL_BOX_CSS_SELECTOR)),text);
                break;
            case "password":
                completeField(getWebElement(By.cssSelector(PASSWORD_BOX_CSS_SELECTOR)),text);
                break;
        }
    }

    public void clicks(String button){
        switch (button){
            case "Sign in verde" :
                clickElement(By.cssSelector(BUTTON_SIGNIN_GREEN_CSS_SELECTOR));
                break;
        }
    }

}
