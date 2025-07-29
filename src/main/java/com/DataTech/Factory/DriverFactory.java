package com.DataTech.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.DataTech.Config.ConfigReader;
import com.DataTech.enums.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

private static ThreadLocal<WebDriver>  tldriver = new ThreadLocal<WebDriver>();

public static void initDriver() {
	String browserValue = ConfigReader.getKeyValue("browser").toUpperCase();
	BrowserType browser = BrowserType.valueOf(browserValue);
	
	switch(browser) {
	case CHROME:
		WebDriverManager.chromedriver().setup();
		tldriver.set(new ChromeDriver());
		
		break;
	case FIREFOX:
		WebDriverManager.firefoxdriver().setup();
		tldriver.set(new FirefoxDriver());
		break;
	case EDGE:
		WebDriverManager.edgedriver().setup();
		tldriver.set(new EdgeDriver());
		break;
	
	}
	
}
public static WebDriver getDriver() {
	return tldriver.get();
}
}
