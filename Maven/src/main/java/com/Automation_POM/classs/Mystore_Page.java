package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore_Page {

	public WebDriver driver;

	@FindBy(xpath = "//a[@rel='nofollow']")
	private WebElement signIn_Btn;

	public Mystore_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSignIn_Btn() {
		return signIn_Btn;
	}

}
