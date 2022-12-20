package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Tab {
	
	public WebDriver driver;

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement terms;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceedBtn;

	public Shipping_Tab(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	
	
	

}
