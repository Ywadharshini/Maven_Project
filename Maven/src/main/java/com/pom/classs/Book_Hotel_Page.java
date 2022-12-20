package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardNo;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exp_Month;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_year;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNowBtn;

	public Book_Hotel_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

}
