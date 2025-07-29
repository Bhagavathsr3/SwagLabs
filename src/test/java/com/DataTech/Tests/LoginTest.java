package com.DataTech.Tests;

import org.testng.annotations.Test;

import com.DataTech.Base.TestBase;
import com.DataTech.Pages.LoginPage;

public class LoginTest extends TestBase{
@Test
	public void validLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
	}
	
}
