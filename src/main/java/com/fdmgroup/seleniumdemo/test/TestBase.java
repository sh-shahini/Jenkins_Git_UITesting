package com.fdmgroup.seleniumdemo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fdmgroup.seleniumdemo.HomePage;

public class TestBase {

	public static WebDriver wd;
	public static HomePage home;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com");
		home = new HomePage(wd);
	}
	
	
	@After
	public void tearDown() {
		wd.quit();
	}
}
