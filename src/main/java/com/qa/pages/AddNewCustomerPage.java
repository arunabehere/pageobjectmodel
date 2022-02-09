package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class AddNewCustomerPage extends TestBase{

	public AddNewCustomerPage() {
		//initialization();    /// only when Login functionalities are not called
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement nCust;
	
	@FindBy(name="name")
	WebElement custName;
	
	@FindBy(css="input[value='m']")
	WebElement male;
	
	@FindBy(css="input[value='f']")
	WebElement female;
	
	@FindBy(name="dob")
	WebElement calendar;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="sub")
	WebElement buttonSubmit;
	
	@FindBy(name="pinno")
	WebElement pin;
		
	@FindBy(name="telephoneno")
	WebElement cell;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@Test  //// use testNG dataProvider ,or test data from excel
	public void submitNewCustomerDetails() {
		nCust.click();
		custName.sendKeys("aruna");
		female.click();
		calendar.sendKeys("12-01-1993");
		city.sendKeys("Bangalore");
		email.sendKeys("abangalore@gmail.com");
		cell.sendKeys("9883333330");
		pin.sendKeys("232323");
		state.sendKeys("Karnataka");
		address.sendKeys("Bangalore");
		password.sendKeys("password");
		buttonSubmit.click();
		
	}
	
	
	
}
