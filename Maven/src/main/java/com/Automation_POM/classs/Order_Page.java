package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
	private WebElement proceedBtn;

	public Order_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}

