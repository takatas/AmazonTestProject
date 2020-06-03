package com.amazontest.methods;

import com.amazontest.base.Base;
import com.amazontest.base.Enums;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.WebDriver;
import com.amazontest.base.Enums.UserType;
import com.amazontest.pageobject.Login;

public class LoginPage extends Base {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver loginProcess() {

        String baseURL = "https://www.amazon.com/";
        this.driver = buildDriver(Enums.BrowserType.CHROME, baseURL);

        Login login = new Login(driver);
        waitProcess();
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

//        String secret = "YQC5HSJDJMJNEZJSV2WIVNAVQB5BVKIEZELHCU7OONL64CKOU4EA";
//        // initialize OTP
//        Totp generator = new Totp(secret);
//        // generate token
//        String totp = generator.now();



        assertControl(driver.getTitle(), expectedTitle);
        login.accountList().click();
        waitProcess();

        login.userName().sendKeys(UserType.AMAZON_TEST.getUserName());
        waitProcess();

        login.btnContinue().click();
        waitProcess();;

        login.password().sendKeys(UserType.AMAZON_TEST.getPassword());
        waitProcess();
        login.btnSubmit().click();
        waitProcess();
//        login.btnContinue().click();
//        waitProcess();
//        login.otpEditText().sendKeys(totp);


        waitProcess(15000);

        return driver;
    }

}
