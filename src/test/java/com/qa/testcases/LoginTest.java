package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	
	@Test
	public void verifyTitle() {
		LoginPage lp = new LoginPage(driver);
		lp.aVerifyText("Google");
		System.out.println(" Test Finished nicely");
		
		
	}

}
