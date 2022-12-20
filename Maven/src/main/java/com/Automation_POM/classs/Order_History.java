package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_History {

	public WebDriver driver;

	@FindBy(xpath = "//h1[text()='Order history']")
	private WebElement text;

	public Order_History(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getText() {
		return text;
	}

}

