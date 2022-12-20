package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.pom.classs.Book_Hotel_Page;
import com.pom.classs.Booking_Confrim_Page;
import com.pom.classs.Login_Page;
import com.pom.classs.Myitinerary_Page;
import com.pom.classs.Search_Hotel_Page;
import com.pom.classs.Select_Hotel_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	private Login_Page lp;
	private Search_Hotel_Page shp;
	private Select_Hotel_Page hotel;
	private Book_Hotel_Page bhp;
	private Booking_Confrim_Page bcp;
	private Myitinerary_Page ip;

	public Page_Object_Manager(WebDriver driver) {

		this.driver = driver;
	}

	public Login_Page getLp() {

		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}

	public Search_Hotel_Page getShp() {

		if (shp == null) {
			shp = new Search_Hotel_Page(driver);
		}
		return shp;
	}

	public Select_Hotel_Page getHotel() {

		if (hotel == null) {
			hotel = new Select_Hotel_Page(driver);
		}
		return hotel;
	}

	public Book_Hotel_Page getBhp() {

		if (bhp == null) {
			bhp = new Book_Hotel_Page(driver);
		}
		return bhp;
	}

	public Booking_Confrim_Page getBcp() {

		if (bcp == null) {
			bcp = new Booking_Confrim_Page(driver);
		}
		return bcp;
	}

	public Myitinerary_Page getIp() {

		if (ip == null) {
			ip = new Myitinerary_Page(driver);
		}
		return ip;
	}

}
