package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddNewCustomerPage;

public class AddCustomerTest extends TestBase{

	AddNewCustomerPage newCust;


	@BeforeMethod
	public void setUp() {
		newCust = new AddNewCustomerPage(driver);
	}


	@Test(priority=2)
	public void customerCreated() throws InterruptedException {
Thread.sleep(5);
		newCust.submitNewCustomerDetails();
	}
}

