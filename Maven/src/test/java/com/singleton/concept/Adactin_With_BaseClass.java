package com.singleton.concept;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

import singleton.reader.classs.Adactin_File_Reader;

public class Adactin_With_BaseClass extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		manage_Commands("maximize");

		url_Launch("https://adactinhotelapp.com/");

		sleep(1000);

		String userName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getusername();

		send_Keys(manager.getLp().getUserName(), userName);

		String password = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();

		send_Keys(manager.getLp().getPassword(), password);

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);

		String location = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getLocation();

		dropDown(manager.getShp().getLocation(), "visible Text", location);

		String hotel = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getHotel();

		dropDown(manager.getShp().getHotels(), "index", hotel);

		String roomType = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getRoomType();

		dropDown(manager.getShp().getRoomType(), "value", roomType);

		String noOfRooms = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getNoOfRooms();

		dropDown(manager.getShp().getNoOfRooms(), "value", noOfRooms);

		clear_Element(manager.getShp().getCheckInDate());

		String checkInDate = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCheckInDate();

		send_Keys(manager.getShp().getCheckInDate(), checkInDate);

		clear_Element(manager.getShp().getCheckOutDate());

		String checkOutDate = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCheckOutDate();

		send_Keys(manager.getShp().getCheckOutDate(), checkOutDate);

		String adult = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getAdultRoom();

		dropDown(manager.getShp().getAdultPerRoom(), "index", adult);

		String child = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getChildRoom();

		dropDown(manager.getShp().getChildPerRoom(), "value", child);

		click_On_Element(manager.getShp().getSearchBtn());

		sleep(2000);

		click_On_Element(manager.getHotel().getRadioBtn());

		click_On_Element(manager.getHotel().getContinueBtn());

		String firstName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getFirstName();

		send_Keys(manager.getBhp().getFirstName(), firstName);

		String lastName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getLastName();

		send_Keys(manager.getBhp().getLastName(), lastName);

		String address = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getAddress();

		send_Keys(manager.getBhp().getAddress(), address);

		String cardNo = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCardNo();

		send_Keys(manager.getBhp().getCardNo(), cardNo);

		String cardType = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCardType();

		dropDown(manager.getBhp().getCardType(), "value", cardType);

		String expMonth = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getExpMonth();

		dropDown(manager.getBhp().getExp_Month(), "visible text", expMonth);

		String expYear = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getExpYear();

		dropDown(manager.getBhp().getExp_year(), "index", expYear);

		String cvv = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getCvv();

		send_Keys(manager.getBhp().getCvv(), cvv);

		sleep(3000);

		click_On_Element(manager.getBhp().getBookNowBtn());

		sleep(5000);

		click_On_Element(manager.getBcp().getItineraryBtn());

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\hotel.png");

		click_On_Element(manager.getIp().getLogoutBtn());
		
		// sleep(2000);

		// click_On_Element(manager.getIp().getCheckBox());

		// click_On_Element(manager.getIp().getCancelBtn());

		// alert("accept");

		// close();

	}
}
