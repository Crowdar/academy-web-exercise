package com.crowdar.examples.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;

public class CommonService {

    public static void displayedPage(String text) {

        String page = HomeConstants.INDEX_LOCATOR;
        if (text.equals("My Account")) page = LoginConstants.LOGIN_FORM_LOCATOR;
        WebActionManager.isPresent(page);

    }

    public static void signIn(String text) {

        String button = HomeConstants.SIGN_IN_HOME_LOCATOR;
        if (text.equals("My Account")) button = LoginConstants.SIGN_IN_FORM_LOCATOR;
        WebActionManager.click(button);
    }
}
