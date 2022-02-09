package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.qa.utilities.TestUtils;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	Logger logger;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/configuration/config.properties");
			prop.load(fs);
			//logger = Logger.getLogger("pageobjectmodel");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception s) {
			s.printStackTrace();
		}
		
	}
	
	public void initialization() {
		String browser = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String chromeDriver = prop.getProperty("chromeDriver");
		String chromePath = prop.getProperty("chromeDriverExe");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(chromeDriver,System.getProperty("user.dir")+chromePath);
			driver=new ChromeDriver();
		}
		
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.pageLoadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitWait, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	/*
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */
}
