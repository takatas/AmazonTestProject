package com.amazontest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourList {
	WebElement element = null;
	WebDriver driver = null;

	public YourList(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement yourListProductName () {
		element = driver.findElement(By.xpath("//div[@class='a-column a-span12 g-span12when-narrow g-span7when-wide']//div[@class='a-row a-size-small']//h3[@class='a-size-base']//a"));
		return element;
	}

	public WebElement productDelete () {
		//element = driver.findElement(By.xpath("//span[@class='a-declarative']//input[@name='submit.deleteItem']"));
		element = driver.findElement(By.xpath("//a[contains(text(),'Delete item')]"));
		return element;
	}

	public WebElement deleteAlert () {
		element = driver.findElement(By.xpath("//div[@class='a-box a-alert-inline a-alert-inline-success']//div[@class='a-alert-content']"));
		return element;
	}



}
