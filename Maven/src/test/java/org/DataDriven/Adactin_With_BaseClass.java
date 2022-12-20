package org.DataDriven;

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

		String userName = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 1,
				5);

		send_Keys(manager.getLp().getUserName(), userName);

		String password = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 2,
				5);

		send_Keys(manager.getLp().getPassword(), password);

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);

		String loc = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 4,
				5);

		dropDown(manager.getShp().getLocation(), "visible Text", loc);

		String hotelname = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 5,
				5);

		dropDown(manager.getShp().getHotels(), "index", hotelname);

		String roomtype = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 6,
				5);

		dropDown(manager.getShp().getRoomType(), "value", roomtype);

		String room = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 7,
				5);

		dropDown(manager.getShp().getNoOfRooms(), "value", room);

		clear_Element(manager.getShp().getCheckInDate());

		String checkIn = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 8,
				5);

		send_Keys(manager.getShp().getCheckInDate(), checkIn);

		clear_Element(manager.getShp().getCheckOutDate());

		String checkOut = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 9,
				5);

		send_Keys(manager.getShp().getCheckOutDate(), checkOut);

		String adult = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 10,
				5);

		dropDown(manager.getShp().getAdultPerRoom(), "index", adult);

		String child = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 11,
				5);

		dropDown(manager.getShp().getChildPerRoom(), "value", child);

		click_On_Element(manager.getShp().getSearchBtn());

		sleep(2000);

		click_On_Element(manager.getHotel().getRadioBtn());

		click_On_Element(manager.getHotel().getContinueBtn());

		String first = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 15,
				5);

		send_Keys(manager.getBhp().getFirstName(), first);

		String last = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 16,
				5);

		send_Keys(manager.getBhp().getLastName(), last);

		String place = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 17,
				5);

		send_Keys(manager.getBhp().getAddress(), place);

		String card = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 26,
				5);

		String no = String.valueOf(card);

		send_Keys(manager.getBhp().getCardNo(), no);

		String cardType = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 19,
				5);

		dropDown(manager.getBhp().getCardType(), "value", cardType);

		String mon = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 20,
				5);

		dropDown(manager.getBhp().getExp_Month(), "visible text", mon);

		String expyr = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 21,
				5);

		dropDown(manager.getBhp().getExp_year(), "index", expyr);

		String cv = particular_Cell_Date(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Testcase for Adactin hotel website.xlsx", 0, 22,
				5);

		send_Keys(manager.getBhp().getCvv(), cv);

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
