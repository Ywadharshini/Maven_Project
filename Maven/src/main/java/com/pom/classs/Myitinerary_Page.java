package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myitinerary_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logoutBtn;

	public Myitinerary_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
}
