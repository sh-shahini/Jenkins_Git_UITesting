package com.fdmgroup.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("I open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("I launch the zero banking application")
	public void launchApplication() {
		driver.get("http://zero.webappsecurity.com/index.html");
	}
	
	@Then("sign in button should exist")
	public void singInButton() {
		if (driver.findElement(By.xpath("//button[contains(@class,'signin')]")).isDisplayed()) {
			System.out.println("test case passed!");
		}else {
			System.out.println("test case failed");
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
