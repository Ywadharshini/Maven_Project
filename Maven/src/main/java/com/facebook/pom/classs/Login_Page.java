package com.facebook.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver; // null

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;

	public Login_Page(WebDriver driver) {

		this.driver = driver; // runner class driver
		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
