package com.Automation_POM.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summerdress_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Printed Summer Dress'])[2]")
	private WebElement img;

	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickViewBtn;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement fr;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement qty;

	@FindBy(xpath = "//select[contains(@class,'select no-print')]")
	private WebElement size;

	@FindBy(xpath = "//a[@title='Blue']")
	private WebElement color;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addToCart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedBtn;

	public Summerdress_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getQuickViewBtn() {
		return quickViewBtn;
	}

	public WebElement getFr() {
		return fr;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}
