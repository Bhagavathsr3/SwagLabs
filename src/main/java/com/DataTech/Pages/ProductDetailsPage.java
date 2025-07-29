package com.DataTech.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends  BasePage{

	public ProductDetailsPage(WebDriver tldriver) {
		super(tldriver);
		
	}

	@FindBy(xpath = "//*[@data-test='inventory-item-price']")
	private WebElement productPrize;
	
	@FindBy(xpath = "//*[@data-test='inventory-item-name']")
	private WebElement productName;
	
	public String getProductName() {
		
		String productNameText = productName.getText();
		return productNameText;
		
	}

public String getProductPrize() {
		
		String productNamePrizeText = productPrize.getText();
		return productNamePrizeText;
		
		
	}
	
	
	
}
