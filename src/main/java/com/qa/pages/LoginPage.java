package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory
	public LoginPage() {
		initialization();
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
	
	@FindBy(xpath="//*[contains(text(),'mngr385253')]")
	public WebElement verifyText;
	
	
	public void login(String user, String pwd) {
		userName.sendKeys(user);
		password.sendKeys(pwd);
	}
	
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	
	public void reset() {
		reset.click();
	}

}
