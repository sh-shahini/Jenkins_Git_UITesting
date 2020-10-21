package com.fdmgroup.seleniumdemo.test;
import org.testng.annotations.Test;

public class FlipKartTest extends TestBase {
	
	
	@Test
	public void firstTest() throws InterruptedException {
		home.closePopUp();
		home.searchQuery("selenium");
		Thread.sleep(10000);
	}
	
	
}
