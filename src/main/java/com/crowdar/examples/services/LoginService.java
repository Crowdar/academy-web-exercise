package com.crowdar.examples.services;

import com.crowdar.core.actions.WebActionManager;

import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.WebElement;


public class LoginService {

    public static void inputLogin(String email, String password) {

        WebActionManager.waitPresence(LoginConstants.LOGIN_FORM_LOCATOR);
        WebElement form = WebActionManager.getElement(LoginConstants.LOGIN_FORM_LOCATOR);
        CommonService.scroll(form);

        WebActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
    }


    public static void submitFormLogin() {
        WebElement form = WebActionManager.getElement(LoginConstants.LOGIN_FORM_LOCATOR);
        form.submit();
    }

}