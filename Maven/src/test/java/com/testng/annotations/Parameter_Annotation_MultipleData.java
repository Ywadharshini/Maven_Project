package com.testng.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_Annotation_MultipleData {

	@DataProvider
	public String[][] dataValues() {
		String values[][] = {

				{ "priya", "123456" }, { "dharshini", "67890" }, { "gopika", "34567" },

		};

		return values;
	}

	@Test(dataProvider = "dataValues")
	public void credencials(String userName, String password) {

		System.out.println("Username : " + userName);
		System.out.println("Password : " + password);
	}

	@Test(dataProvider = "address", dataProviderClass = DataProvider_Utility.class)
	public void address(String add, String place) {

		System.out.println("Address : " + add);
		System.out.println("Place : " + place);

	}

}
