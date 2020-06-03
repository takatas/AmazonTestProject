package com.amazontest.methods;

import com.amazontest.base.Base;
import com.amazontest.pageobject.Main;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class MainPage extends Base {

    WebDriver driver = null;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) throws InterruptedException {
        Main main = new Main(driver);

        main.searchText().sendKeys(productName);
        waitProcess();
        main.searchText().sendKeys(Keys.RETURN);
        waitProcess();
        try {
            if(isFindProduct(main.listProduct())){
                System.out.println("Products are found");
                main.pageButton().click();
                waitProcess();
                String link = driver.getCurrentUrl();
                if(link.contains("ref=sr_pg_2")) {
                    System.out.println("Page 2 is chosen");
                    main.selectProduct().click();
                } else
                    System.out.println("Page 2 couldn't choose");

            }

        }catch (Exception e ){
            System.out.println("Product list is null");
            e.printStackTrace();

        }




    }


}
