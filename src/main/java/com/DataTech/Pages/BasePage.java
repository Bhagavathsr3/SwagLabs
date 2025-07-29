package com.DataTech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver tldriver;
	public BasePage(WebDriver tldriver) {
		
		this.tldriver=tldriver;
		PageFactory.initElements(tldriver, this);
	}
}
