package com.DataTech.dataProvider;

import org.testng.annotations.DataProvider;

public class FilterDataProviderHomePage {

@DataProvider(name = "filteroptions")
public Object[][] filterData() {
	return new Object[][]{
		{"Name (A to Z)"},
		{"Name (Z to A)"},
		{"Price (low to high)"},
		{"Price (high to low)"}
	};
		
	}
}
