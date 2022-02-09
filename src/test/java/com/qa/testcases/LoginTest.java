package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage lp;
	
	@BeforeMethod
	public void setUp() {
		lp = new LoginPage(driver);
	}
	
	@Test(priority=1, enabled=false)
	public void verifyReset() {
		lp.login(prop.getProperty("user"), prop.getProperty("password"));
		lp.reset();
		}
	
	@Test(priority=2)
	public void verifyTitle() {
		
		lp.login(prop.getProperty("user"), prop.getProperty("password"));
		lp.clickLogin();
		assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		}
}
