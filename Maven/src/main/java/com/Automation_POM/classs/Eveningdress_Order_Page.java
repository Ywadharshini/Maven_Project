package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress_Order_Page {
	

	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedBtn;

	public Eveningdress_Order_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	

}
