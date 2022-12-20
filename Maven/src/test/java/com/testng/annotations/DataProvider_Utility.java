package com.testng.annotations;

import org.testng.annotations.DataProvider;

public class DataProvider_Utility {
	
	@DataProvider
	public String[][] address() {
		String values[][] = {

				{ "add1", "Salem" }, { "add2", "Covai" }, { "add3", "Bangalore" },

		};

		return values;
	}

}
