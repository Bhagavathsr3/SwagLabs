package com.DataTech.Tests;

import org.testng.annotations.Test;

import com.DataTech.Base.TestBase;
import com.DataTech.Pages.HomePage;
import com.DataTech.Pages.LoginPage;
import com.DataTech.dataProvider.FilterDataProviderHomePage;

public class HomeTest extends TestBase {
	
@Test(dataProvider = "filteroptions", dataProviderClass = FilterDataProviderHomePage.class, priority = 1)	
	public void verifyFilters(String options) {
	    System.out.println(options+ "is executing");
		HomePage hp = new HomePage(driver);
		hp.filteroptions(options);
		System.out.println(options+ "is executed");
	}
	
	
	
@Test(priority = 2)
	public void addCheapestProduct() {
		HomePage hp = new HomePage(driver);
		hp.addCheapestProductToCart();
	}

@Test()
public void sortbyName() {
	HomePage hp = new HomePage(driver);
	hp.sortByNameZtoA();
}
@Test
    public void getProductNameAndPrice() {
	HomePage hp = new HomePage(driver);
	hp.getFirstThreeProductList();
}
    
}
