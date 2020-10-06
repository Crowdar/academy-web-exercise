package com.crowdar.examples.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.SummaryConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonService {



    public static void homePage(){
        String page = "http://automationpractice.com/";
        WebActionManager.navigateTo(page);
    }

    public static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    public static boolean constantPrice(String p1, String p2){
        if(p1.equals(p2))
            return true;
        else return false;
    }
}
