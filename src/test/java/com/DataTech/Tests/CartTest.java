package com.DataTech.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DataTech.Base.TestBase;
import com.DataTech.Pages.CartPage;

public class CartTest extends TestBase{
	
	String cartproductName;
	String cartproductPrize;
	String productQuantity ;
	int quantity;
	
@Test(priority = 1)
	public void verifyProductDetails() {
		
		CartPage cp = new CartPage(driver);
		cp.getCartIcon().click();
		cartproductName = cp.getCartProductName().getText();
		cartproductPrize = cp.getCartProductPrizeName().getText();
		productQuantity = cp.getItemQuantity().getText();
		quantity = Integer.parseInt(productQuantity);
		System.out.println("Cart product name is "+cartproductName+"\n"+"Cart product Prize is "
		                                  + cartproductPrize+"\nProduct quantity is "+quantity);
}
@Test(dependsOnMethods = "verifyProductDetails")
		public void assertProductDetails() {
			
			
			Assert.assertEquals(cartproductName, "Sauce Labs Onesie");
			Assert.assertEquals(cartproductPrize, "$7.99");
			
			Assert.assertEquals(quantity, 1);
		}
		
	}
