package com.qa.pages;

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
	
	@FindBy(css="input[name='uid']")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	@FindBy(name="btnReset")
	WebElement reset;
	
	
	@Test
	public void login(String user, String pwd) {
		userName.sendKeys(user);
		password.sendKeys(pwd);
	}
	
	@Test
	public void clickLogin() {
		loginBtn.click();
	}
	@Test
	public void reset() {
		reset.click();
	}

}
