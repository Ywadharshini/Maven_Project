package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noOfRooms;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkInDate;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultPerRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childPerRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement searchBtn;

	public Search_Hotel_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
}
