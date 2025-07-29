package com.DataTech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.DataTech.utils.WaitUtils;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver tldriver) {
		super(tldriver);
		
	}
@FindBy(xpath = "//*[@id='user-name']")
private WebElement userNameInput;

@FindBy(xpath = "//*[@id='password']")
private WebElement passwordInput;

@FindBy(xpath = "//*[@id='login-button']")
private WebElement loginBtn;

public void login(String username, String password) {
	
	userNameInput.sendKeys(username);
	passwordInput.sendKeys(password);
	WaitUtils.waitUntilClickable(loginBtn);
	loginBtn.click();
}
}
