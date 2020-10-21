package com.fdmgroup.seleniumdemo.test;

import org.testng.annotations.Test;

public class TestNGScripts {
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void handleExceptionTest() {
		String x = "100A";
		Integer.parseInt(x);
	}
}
