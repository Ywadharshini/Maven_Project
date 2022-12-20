package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_Page {
	
	public WebDriver driver;

	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[text()='Casual Dresses'])[2]")
	private WebElement casualDress;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningDress;
	
	@FindBy(xpath="(//a[text()='Summer Dresses'])[2]")
	private WebElement summerDress;

	public Myaccount_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getCasualDress() {
		return casualDress;
	}
	
	public WebElement getEveningDress() {
		return eveningDress;
	}
	
	public WebElement getSummerDress() {
		return summerDress;
	}

	
	
}
