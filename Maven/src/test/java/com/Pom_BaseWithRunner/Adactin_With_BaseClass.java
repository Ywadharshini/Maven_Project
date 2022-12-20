package com.Pom_BaseWithRunner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Adactin_With_BaseClass extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		manage_Commands("maximize");

		url_Launch("https://adactinhotelapp.com/");

		sleep(1000);

		send_Keys(manager.getLp().getUserName(), "Ywadharshini");

		send_Keys(manager.getLp().getPassword(), "junnu06");

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);

		dropDown(manager.getShp().getLocation(), "visible Text", "London");

		dropDown(manager.getShp().getHotels(), "index", "2");

		dropDown(manager.getShp().getRoomType(), "value", "Standard");

		dropDown(manager.getShp().getNoOfRooms(), "value", "2");

		clear_Element(manager.getShp().getCheckInDate());

		send_Keys(manager.getShp().getCheckInDate(), "13/11/2022");

		clear_Element(manager.getShp().getCheckOutDate());

		send_Keys(manager.getShp().getCheckOutDate(), "25/11/2022");

		dropDown(manager.getShp().getAdultPerRoom(), "index", "2");

		dropDown(manager.getShp().getChildPerRoom(), "value", "2");

		click_On_Element(manager.getShp().getSearchBtn());

		sleep(2000);

		click_On_Element(manager.getHotel().getRadioBtn());

		click_On_Element(manager.getHotel().getContinueBtn());

		send_Keys(manager.getBhp().getFirstName(), "Ywa");

		send_Keys(manager.getBhp().getLastName(), "dharshini");

		send_Keys(manager.getBhp().getAddress(), "XYZ, Salem");

		send_Keys(manager.getBhp().getCardNo(), "1234567898765430");

		dropDown(manager.getBhp().getCardType(), "value", "MAST");

		dropDown(manager.getBhp().getExp_Month(), "visible text", "March");

		dropDown(manager.getBhp().getExp_year(), "index", "12");

		send_Keys(manager.getBhp().getCvv(), "123");

		sleep(3000);

		click_On_Element(manager.getBhp().getBookNowBtn());

		sleep(5000);

		click_On_Element(manager.getBcp().getItineraryBtn());

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\hotel.png");

		sleep(2000);

		click_On_Element(manager.getIp().getCheckBox());

		click_On_Element(manager.getIp().getCancelBtn());

		alert("accept");

		// close();

	}
}
