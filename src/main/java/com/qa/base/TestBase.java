package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.qa.utilities.TestUtils;

public class TestBase {
	public  Properties prop;
	public  WebDriver driver;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/configuration/config.properties");
			System.out.println("user directory " + System.getProperty("user.dir"));
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception s) {
			s.printStackTrace();
		}
		
	}
	
	@BeforeTest
	public WebDriver initialization() {
		String browser = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.pageLoadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitWait, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
