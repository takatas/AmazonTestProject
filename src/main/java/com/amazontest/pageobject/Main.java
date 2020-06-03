package com.amazontest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {
	WebElement element = null;
	WebDriver driver = null;

	public Main(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchText () {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}

	public String listProduct () {
		String products  = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div";
		//String products  = "//*[@id=\"search\"]/div[1]/div[1]/div/span[4]/div[1]/div/div[1]";
		return products;
	}

	public WebElement pageButton () {
		element = driver.findElement(By.xpath("//li[@class='a-normal']//a[contains(text(),'2')]"));
		return element;
	}

	public WebElement selectProduct () {
		element = driver.findElement(By.xpath("//div[3]//div[1]//span[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//h2[1]//a[1]"));
		//element = driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=2']//a[@class='a-link-normal a-text-normal']"));
		return element;
	}
}
