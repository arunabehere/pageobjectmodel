package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddNewCustomerPage;

public class AddCustomerTest extends TestBase{

	AddNewCustomerPage newCust;

	public AddCustomerTest() {
		newCust = new AddNewCustomerPage();
	}

	@Test(priority=2)
	public void customerCreated(){	
		newCust.submitNewCustomerDetails();
	}
}

