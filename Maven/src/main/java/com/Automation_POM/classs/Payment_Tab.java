package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Tab {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confrim;

	public Payment_Tab(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank() {
		return bank;
	}

	public WebElement getConfrim() {
		return confrim;
	}
	
	
	
	
	

}
