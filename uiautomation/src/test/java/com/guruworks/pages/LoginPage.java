package com.guruworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = ".//input[@id='username']")WebElement username;
	
	@FindBy(xpath = ".//input[@id='password']")WebElement password;
	
	@FindBy(xpath = ".//button[@id='submitBtn']")WebElement loginButton;

	public void login(String applicationUsername, String applicationUserPassword) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		username.sendKeys(applicationUsername);
		password.sendKeys(applicationUserPassword);

		loginButton.click();
	}

}
