package com.fdmgroup.seleniumdemo.formy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fdmgroup.seleniumdemo.HomePage;

public class TestBase {

	public static WebDriver wd;
	public static HomePage home;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com");
		home = new HomePage(wd);
	}
	@Test
	public void firstTest() throws InterruptedException {
		home.closePopUp();
		home.searchQuery("selenium");
		Thread.sleep(10000);
	}
	
	
	@AfterTest
	public void tearDown() {
		wd.quit();
	}
}
