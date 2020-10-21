package com.fdmgroup.seleniumdemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	@Parameters({"url"})
	public void googleTitleTest(String url) {
		driver.get(url);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
