package com.fdmgroup.seleniumdemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/JSONreports"}, monochrome=true)
public class TestRunner {

}
