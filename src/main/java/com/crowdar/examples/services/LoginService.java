package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;

public class LoginService {
    /*  */

    public static void inputLogin(String email, String password) {

        LoadedService.viewLoaded(LoginConstants.EMAIL_INPUT_LOCATOR);
        ActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);

        LoadedService.viewLoaded(LoginConstants.EMAIL_INPUT_LOCATOR);
        ActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);

        ActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);


    }
}