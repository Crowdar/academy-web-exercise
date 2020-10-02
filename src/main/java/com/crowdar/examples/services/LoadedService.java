package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CommonConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

public class LoadedService {

    public static void viewHome(){
        ActionManager.waitVisibility(HomeConstants.LOGO_HOME);
        Assert.assertTrue(ActionManager.isVisible(HomeConstants.LOGO_HOME),
                CommonConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void viewLoaded(String element) {
        ActionManager.waitVisibility(element);
        Assert.assertTrue(ActionManager.isVisible(element),
                CommonConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }


}
