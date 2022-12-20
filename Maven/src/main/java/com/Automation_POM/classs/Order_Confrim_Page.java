package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confrim_Page {

	public WebDriver driver;

	@FindBy(xpath = "//p[@class='cheque-indent']")
	private WebElement text;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back;

	public Order_Confrim_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getBack() {
		return back;
	}

}
