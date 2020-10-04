package com.crowdar.examples.services;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class LoginService {
    /*  */

    public static void inputLogin(String email, String password) {

        WebActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
    }

    public static void displayForm(){
        WebElement form = WebActionManager.getElement(LoginConstants.LOGIN_FORM_LOCATOR);
        scroll(form);
        WebActionManager.isVisible(LoginConstants.LOGIN_FORM_LOCATOR);

    }

    public static void submitFormLogin(){
        WebElement form = WebActionManager.getElement(LoginConstants.LOGIN_FORM_LOCATOR);
        form.submit();
    }

    private static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }





}