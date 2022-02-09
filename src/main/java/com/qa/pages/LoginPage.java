package com.qa.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	WebDriver driver;
	
	//PageFactory
	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="")
	WebElement userName;
	
	@FindBy(id="")
	WebElement password;
	
	@FindBy(id="")
	WebElement loginBtn;
	
	@FindBy(css="input.gLFyf gsfi")
	WebElement search;
	
	@FindBy(css="input.gNO89b")
	WebElement clickBtn;
	
	@Test
	public void sendSearchText(String value) {
		search.sendKeys(value);
		clickBtn.click();
	}
	
	@Test
	public void aVerifyText(String pageTitle) {
		String title = driver.getTitle();
		assertEquals(title,pageTitle);
	}

}
