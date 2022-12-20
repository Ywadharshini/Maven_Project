package singleton.reader.classs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AdactinData_Reader {

	public static Properties p;

	public AdactinData_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\src\\main\\java\\singleton\\properties\\AdactinData.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getusername() {
		String userNAme = p.getProperty("username");
		return userNAme;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getLocation() {
		String location = p.getProperty("location");
		return location;
	}
	
	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	
	public String getRoomType() {
		String roomType = p.getProperty("roomType");
		return roomType;
	}
	
	public String getNoOfRooms() {
		String noOfRooms = p.getProperty("noOfRooms");
		return noOfRooms;
	}
	
	public String getCheckInDate() {
		String checkInDate = p.getProperty("checkInDate");
		return checkInDate;
	}
	
	public String getCheckOutDate() {
		String checkOutDate = p.getProperty("checkOutDate");
		return checkOutDate;
	}
	
	public String getAdultRoom() {
		String adultRoom = p.getProperty("adultRoom");
		return adultRoom;
	}
	
	public String getChildRoom() {
		String childRoom = p.getProperty("childRoom");
		return childRoom;
	}
	
	public String getFirstName() {
		String firstName = p.getProperty("firstName");
		return firstName;
	}
	
	public String getLastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
	}
	
	public String getAddress() {
		String lastName = p.getProperty("address");
		return lastName;
	}
	
	public String getCardNo() {
		String cardNo = p.getProperty("cardNo");
		return cardNo;
	}
	
	public String getCardType() {
		String cardType = p.getProperty("cardType");
		return cardType;
	}
	
	public String getExpMonth() {
		String expMonth = p.getProperty("expMonth");
		return expMonth;
	}
	
	public String getExpYear() {
		String expYear = p.getProperty("expYear");
		return expYear;
	}
	
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}


}
