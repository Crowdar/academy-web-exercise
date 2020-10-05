package com.crowdar.examples.services;


import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.ModalAddToCartConstants;
import com.crowdar.examples.constants.ProductConstants;
import com.crowdar.examples.constants.SummaryConstants;
import org.openqa.selenium.WebElement;


import java.util.Random;

public class BuyService {

    private static int popularMin = 0;
    private static int popularMax = 6;
    private static int bsMin = 7;
    private static int bsMax = 13;

    private static String initPrice = null;
    private static String modalPrice= null;
    private static boolean staticPrice = false;

    public static void clickButton(String button){

        if(button.equals("Add to cart"))
            WebActionManager.click(ProductConstants.ADD_BUTTON_LOCATOR, true);
        if(button.equals("checkout") && CommonService.constantPrice(initPrice,modalPrice))
            WebActionManager.click(ModalAddToCartConstants.CHECKOUT_BUTTON_CART_LOCATOR);
        if(button.equals("summary"))
            WebActionManager.click(SummaryConstants.CHECKOUT_BUTTON_SUMMARY_LOCATOR);
        if(button.equals("address"))
            WebActionManager.click(SummaryConstants.CHECKOUT_BUTTON_ADDRES_LOCATOR);
        if(button.equals("shipping"))
            WebActionManager.click(SummaryConstants.CHECKOUT_BUTTON_SHIPPING_LOCATOR);
        if(button.equals("confirm order"))
            WebActionManager.click(SummaryConstants.PROCESS_BUTTON_CHECKOUT_LOCATOR);
        if(button.equals("bank"))
            WebActionManager.click(SummaryConstants.PAY_BANK_LOCATOR);
        if(button.equals("check"))
            WebActionManager.click(SummaryConstants.PAY_CHECK_LOCATOR);
        if (button.equals("confirm"))
            WebActionManager.click(SummaryConstants.CONFIRM_BUTTON_LOCATOR);

    }

    public static void selectProduct(String tabName) {
        WebElement tabToActive = null;
        int index;
        Random random = new Random();

        if (tabName.equals("Popular")){
            tabToActive = WebActionManager.getElement(HomeConstants.TAB_POPULAR_HOME_LOCATOR);
            index = random.ints(popularMin, popularMax).findFirst().getAsInt();
        }
        else {
            tabToActive = WebActionManager.getElement(HomeConstants.TAB_BS_HOME_LOCATOR);
            index = random.ints(bsMin, bsMax).findFirst().getAsInt();
        }

        tabToActive.click();

        WebElement product = WebActionManager.getElements(HomeConstants.PRODUCT_HOME_LOCATOR).get(index);
        CommonService.scroll(product);
        product.click();

    }

    public static void addToCart() {

        WebActionManager.isVisible(ModalAddToCartConstants.MODAL_TO_CART_LOCATOR);

        WebElement price = WebActionManager.getElement(ProductConstants.PRICE_LOCATOR);
        initPrice = price.getText();

        WebElement priceModalCart = WebActionManager.getElement(ModalAddToCartConstants.PRICE_LOCATOR);
        modalPrice = priceModalCart.getText();

    }

    public static boolean checkAddress(String address) {
        WebActionManager.isVisible(SummaryConstants.ADDRESS_LOCATOR);
        String dir = WebActionManager.getText(SummaryConstants.ADDRESS_LOCATOR);
        if(dir.equals(address))
            return true;
        else return false;
    }

    public static void acceptsTermsAndConditions() {
        WebActionManager.isVisible(SummaryConstants.CHECKOUT_BUTTON_SHIPPING_LOCATOR);


    }

    public static boolean checkPrice(){

        WebElement price = WebActionManager.getElement(SummaryConstants.PRICE_PRODUCT_LOCATOR);
        String finPrice = price.getText();

        if(CommonService.constantPrice(finPrice,initPrice))
            staticPrice = true;

        return staticPrice;

    }

    public static void methodOfPayment(String pay) {
        if (staticPrice)
            clickButton(pay);

    }


}

