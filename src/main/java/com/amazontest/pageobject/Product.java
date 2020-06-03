package com.amazontest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {
	WebElement element = null;
	WebDriver driver = null;

	public Product(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement addToList () {
		element = driver.findElement(By.id("add-to-wishlist-button-submit"));
		return element;
	}

	public WebElement continueShopping () {
		element = driver.findElement(By.id("WLHUC_continue"));
		return element;
	}

	public WebElement accountList () {
		element = driver.findElement(By.id("nav-link-accountList"));
		return element;
	}

	public WebElement wishList () {
		element = driver.findElement(By.xpath("//div[@id='nav-flyout-wl-items']//a[1]//span[1]"));
		return element;
	}

	public WebElement productTitle () {
		element = driver.findElement(By.id("productTitle"));
		return element;
	}
}
