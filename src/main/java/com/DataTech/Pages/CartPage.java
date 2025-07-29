package com.DataTech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.DataTech.utils.WaitUtils;

public class CartPage extends BasePage {

	public CartPage(WebDriver tldriver) {
		super(tldriver);
	}

	@FindBy(id = "shopping_cart_container")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//*[@data-test='inventory-item-name']")
	private WebElement cartProductName;
	
	@FindBy(xpath = "//*[@data-test='inventory-item-price']")
	private WebElement cartProductPrizeName;
	

	@FindBy(xpath = "//*[@data-test='item-quantity']")
	private WebElement itemQuantity;
	
	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getCartProductName() {
		WaitUtils.waitUntilClickable(cartProductName);
		return cartProductName;
	}

	public WebElement getCartProductPrizeName() {
		WaitUtils.waitUntilClickable(cartProductPrizeName);
		return cartProductPrizeName;
	}
    
	public WebElement getItemQuantity() {
		
		return itemQuantity;
	}
}
