package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import java.util.List;
import java.util.Random;

public class StorePaymentPage extends StorePageBase {
    public final String TITTLE_HEADING_CSS_SELECTOR ="#center_column > h1";
    public final String PAYFORM_BLOCK_CSS_SELECTOR="#HOOK_PAYMENT > div > div > p > a";

    public final List<WebElement> payForm = getWebElements(By.cssSelector(PAYFORM_BLOCK_CSS_SELECTOR));

    public StorePaymentPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }

    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(TITTLE_HEADING_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

    public void clickPayForm(){
        Random productSelected = new Random();
        clickElement(payForm.get(productSelected.nextInt(payForm.size())));
    }
}
