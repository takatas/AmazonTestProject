package com.amazontest.testscenairo;

import com.amazontest.base.Base;
import com.amazontest.methods.LoginPage;
import com.amazontest.methods.MainPage;
import com.amazontest.methods.ProductPage;
import com.amazontest.methods.YourPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateProductList extends Base {
	WebDriver driver = null;

	@BeforeClass
	public void beforeClass()  {

		LoginPage login = new LoginPage(driver);
		driver = login.loginProcess();
		waitProcess(10000);


	}

	@Test(priority = 1, alwaysRun = true)
	public void productProcesses() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		ProductPage productPage = new ProductPage(driver);
		YourPage yourPage = new YourPage(driver);
		mainPage.searchProduct("samsung");
		waitProcess();
		String productName = productPage.productProcess();
		waitProcess();
		yourPage.yourListProcess(productName);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
