package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.facebook.pom.classs.Login_Page;

public class Facebook_Pageobject_Manager {

	public WebDriver driver;

	private Login_Page lp;

	public Login_Page getLp() {

		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}

	public Facebook_Pageobject_Manager(WebDriver driver) {

		this.driver = driver;
	}

}
