package com.amazontest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazontest.base.Enums.BrowserType;
import com.amazontest.base.Enums.findElementType;
import org.testng.Assert;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;


    public static WebDriver buildDriver(BrowserType browserType, String baseURL) {

        driver = null;

        switch (browserType) {
            case CHROME:

                driver = new ChromeDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Sayfanın yüklenmesini 3 saniye bekler.

                break;

            case FIREFOX:
                driver = new FirefoxDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Sayfan�n y�klenmesini 3 saniye bekler.

                break;
            default:
                break;
        }

        return driver;
    }

    public static void waitProcess() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void waitProcess(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void mouseHover(WebDriver driver, WebElement elementMain)
            throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(elementMain).perform();
    }


    public Boolean isFindProduct(String findList) {

        List<WebElement> rows = driver.findElements(By.xpath(findList));
        int j = rows.size();
        if (rows.size() > 0) {
            return true;
        } else
            return false;
    }


    public void assertControl(String actualTitle, String expectedTitle) {
        boolean control = false;
        if(actualTitle.equals(expectedTitle)){
            control = true;
        }
        //Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(control,"Page couldn't open");
    }


    public String getTextName(String text) {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        String textName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + text + "')]")))
                .getText();
        return textName;
    }


}