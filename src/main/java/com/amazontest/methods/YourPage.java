package com.amazontest.methods;

import com.amazontest.base.Base;
import com.amazontest.pageobject.YourList;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class YourPage extends Base {

    WebDriver driver = null;

    public YourPage(WebDriver driver) {
        this.driver = driver;
    }

    public void yourListProcess(String name) throws InterruptedException {
        YourList yourList = new YourList(driver);

        String productNames = getTextName(name);
        System.out.println("Product Name : "+productNames);
        waitProcess();
        Assert.assertEquals(name,productNames);
        yourList.productDelete().click();
        waitProcess();
        Assert.assertEquals(yourList.deleteAlert().getText(),"Deleted");



    }
}
