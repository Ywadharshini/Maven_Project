package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confrim_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement itineraryBtn;

	public Booking_Confrim_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItineraryBtn() {
		return itineraryBtn;
	}
	
	

}
