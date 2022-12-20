package org.testng.proj;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;
import singleton.reader.classs.Adactin_File_Reader;

public class Adactin_With_BaseClass extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@BeforeClass
	public void browser() {
		url_Launch("https://adactinhotelapp.com/");

		manage_Commands("maximize");
	}

	@Test(priority = 0, invocationCount = 2)
	public void refresh() {

		manage_Commands("refresh");
	}

	@Test(priority = 1)
	public void Hard_Assert() {

		String expected_Title = Utility_Files.get_Title();

		String Actual_Title = "Adactin.com - Hotel Reservation System";

		Assert.assertSame(expected_Title, Actual_Title);

	}

	@Test(priority = 2)
	public void soft_Assert() {

		driver = Utility_Files.browser_Launch("opera");

		Utility_Files.url_Launch("https://www.instagram.com/");

		String expected_Url = Utility_Files.get_Currenturl();

		String Actual_Url = "https://www.instagram.com/";

		SoftAssert soft = new SoftAssert();

		soft.assertSame(expected_Url, Actual_Url);

		System.out.println("validation success");

	}

	@Test(priority = 3)
	public void login_Page() throws IOException, InterruptedException {

		String userName = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getusername();

		send_Keys(manager.getLp().getUserName(), userName);

		String password = Adactin_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();

		send_Keys(manager.getLp().getPassword(), password);

		click_On_Element(manager.getLp().getLoginBtn());

		sleep(3000);
	}

	@Test(priority = 4, dependsOnMethods = "login_Page", alwaysRun = true)
	public void hotel_Details() throws IOException, InterruptedException {

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
	}

	@Test(priority = 5)
	public void select_Hotel() {

		click_On_Element(manager.getHotel().getRadioBtn());

		click_On_Element(manager.getHotel().getContinueBtn());
	}

	@Test(priority = 6)
	public void personal_Details() throws IOException, InterruptedException {
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

	}

	@Test(priority = 7, description = "My Booking details is displayed")
	public void my_Booking() {

		click_On_Element(manager.getBcp().getItineraryBtn());

	}

	@Test(priority = 8, enabled = false)
	public void screenshot() throws IOException {

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\hotelbooking.png");
	}
	
	@AfterClass
	public void logout() {
		click_On_Element(manager.getIp().getLogoutBtn());
	}

}
