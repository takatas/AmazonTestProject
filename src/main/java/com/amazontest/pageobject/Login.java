package com.amazontest.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver = null;
	public static WebElement username, pass, loginbtn, element = null;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement userName () {
		// email
		element = driver.findElement(By.id("ap_email"));
		return element;
	}
	public WebElement btnContinue () {
		// continiue
		element = driver.findElement(By.id("continue"));
		return element;
	}
	public WebElement password () {
		// Şifre
		element = driver.findElement(By.id("ap_password"));
		return element;
	}
	public WebElement btnSubmit () {
		// login butonu
		element = driver.findElement(By.id("signInSubmit"));
		return element;
	}
	public WebElement accountList () {

		element = driver.findElement(By.id("nav-link-accountList"));
		return element;
	}

	public WebElement otpEditText () {
		// login butonu
		element = driver.findElement(By.name("code"));
		return element;
	}


}
