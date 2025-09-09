package com.DataTech.Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.DataTech.utils.ActionUtils;
import com.DataTech.utils.WaitUtils;

public class HomePage extends BasePage{

	public HomePage(WebDriver tldriver) {
		super(tldriver);
		
	}
@FindBy(xpath = "//div[@class='inventory_item_name ']")
private List<WebElement> firstThreeproducts;

@FindBy(xpath = "//div[@class='inventory_item_price']")
private List<WebElement> firstThreeproductsprice;
	
@FindBy(xpath = "//select[@class='product_sort_container']")
private WebElement sortOption;

@FindBy(css = ".inventory_item_img img")
private List<WebElement> cheapestProduct;

@FindBy(xpath = "//button[text()='Add to cart']")
private WebElement addToCartBtn;

public  void addCheapestProductToCart() {
	ActionUtils.dropdownByVisibleText(sortOption, "Price (low to high)");
	cheapestProduct.get(0).click();
	
	WaitUtils.waitUntilClickable(addToCartBtn);
	addToCartBtn.click();
	
}
public void filteroptions(String text) {
	WaitUtils.waitUntilClickable(sortOption);
	ActionUtils.dropdownByVisibleText(sortOption,text );
}

public void sortByNameZtoA() {
	ActionUtils.dropdownByVisibleText(sortOption, "Name (Z to A)");
}
public void getFirstThreeProductList() {
	
	for(int i=1; i<=3; i++) {
		String productPrice = firstThreeproductsprice.get(i).getText();
		String productTitiles = firstThreeproducts.get(i).getText();
		System.out.println("Product "+i+" is : Title: "+ productTitiles +" Price: "+ productPrice);
		
		if(productPrice=="9.99") {
			System.out.println("The Product Title is :" + productTitiles);
		}
		
		else {
			System.out.println("No product is equals to 9.99");
		}
		
		
	}
}



}
