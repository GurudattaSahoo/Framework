package com.guruworks.testcases;
	
import org.testng.annotations.Test;

import com.guruworks.pages.BaseClass;
import com.guruworks.pages.LoginPage;

import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginApp() 
	{
		logger  = report.createTest("login to Facebook");
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Logging in to the application");
		
		loginPage.login(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
		
		logger.pass("Login successful");
		
	}
	

}
