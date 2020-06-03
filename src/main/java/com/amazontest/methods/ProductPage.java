package com.amazontest.methods;

import com.amazontest.base.Base;
import com.amazontest.pageobject.Main;
import com.amazontest.pageobject.Product;
import com.amazontest.pageobject.YourList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class ProductPage extends Base {

    WebDriver driver = null;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String productProcess() throws InterruptedException {
        Product product = new Product(driver);

        waitProcess();
        String chooseProduct = product.productTitle().getText();
        waitProcess();
        product.addToList().click();
        waitProcess();
        product.continueShopping().click();
        waitProcess();
        mouseHover(driver, product.accountList());
        waitProcess();
        product.wishList().click();
        waitProcess();

        return chooseProduct;
    }
}
