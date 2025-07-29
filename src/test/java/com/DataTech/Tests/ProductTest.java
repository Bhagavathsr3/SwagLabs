package com.DataTech.Tests;

import org.testng.annotations.Test;

import com.DataTech.Base.TestBase;
import com.DataTech.Pages.ProductDetailsPage;

public class ProductTest extends TestBase {

	String productName;
	String productPrize;
	@Test
	public void getProductDetails() {
		
		ProductDetailsPage pd = new ProductDetailsPage(driver);
		 productName = pd.getProductName();
		 productPrize = pd.getProductPrize();
		 System.out.println("Product name is "+productName+"\n"+"Product Prize is "+ productPrize);

	}
}
