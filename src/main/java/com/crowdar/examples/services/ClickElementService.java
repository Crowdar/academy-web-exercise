package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.LoginConstants;

public class ClickElementService {

    public static void clickSingInHome(){
        ActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }
}
