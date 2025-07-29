package com.DataTech.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.DataTech.Config.ConfigReader;
import com.DataTech.Factory.DriverFactory;

public class TestBase {
	protected static WebDriver driver;
@BeforeSuite
	public void setup() throws IOException {
		ConfigReader.loadConfig("prod"); // .properties file is now loaded
		DriverFactory.initDriver();
	    driver= DriverFactory.getDriver();    
	    driver.get(ConfigReader.getKeyValue("url"));
		driver.manage().window().maximize();
		
	}
}
