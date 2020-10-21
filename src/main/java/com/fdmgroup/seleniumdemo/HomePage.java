package com.fdmgroup.seleniumdemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchInput;
	
	@FindBy(xpath = "//button[contains(@class, '_2AkmmA _29YdH8')]")
	WebElement closeBut;
	
	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}

	public void searchQuery(String query) {
		searchInput.sendKeys(query + Keys.ENTER);
	}
	
	public void closePopUp() {
		closeBut.click();
	}

}
