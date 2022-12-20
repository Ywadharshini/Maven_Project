package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;

	public Logout_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogout() {
		return logout;
	}

	

}
