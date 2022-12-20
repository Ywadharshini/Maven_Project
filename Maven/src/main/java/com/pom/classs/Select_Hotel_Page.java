package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioBtn;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;

	public Select_Hotel_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
