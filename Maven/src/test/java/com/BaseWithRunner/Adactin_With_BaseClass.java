package com.BaseWithRunner;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilityfiles.Utility_Files;

public class Adactin_With_BaseClass extends Utility_Files {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser_Launch("chrome");

		manage_Commands("maximize");

		url_Launch("https://adactinhotelapp.com/");

		sleep(1000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		send_Keys(userName, "Ywadharshini");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		send_Keys(pass, "junnu06");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login']"));
		click_On_Element(loginBtn);

		sleep(3000);

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		dropDown(location, "visible Text", "London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		dropDown(hotel, "index", "2");

		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		dropDown(roomType, "value", "Standard");

		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropDown(noOfRooms, "value", "2");

		WebElement checkInDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		clear_Element(checkInDate);
		send_Keys(checkInDate, "16/11/2022");

		WebElement checkOutDate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		clear_Element(checkOutDate);
		send_Keys(checkOutDate, "25/11/2022");

		WebElement adultPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		dropDown(adultPerRoom, "index", "2");

		WebElement childPerRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		dropDown(childPerRoom, "value", "2");

		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		click_On_Element(searchBtn);

		Thread.sleep(1000);

		WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio']"));
		click_On_Element(radioBtn);

		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		click_On_Element(continueBtn);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		send_Keys(firstName, "Ywa");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		send_Keys(lastName, "dharshini");

		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		send_Keys(address, "XYZ, Salem");

		WebElement cardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
		send_Keys(cardNo, "1111111111111111");

		WebElement cardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		dropDown(cardType, "value", "MAST");

		WebElement exp_Date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		dropDown(exp_Date,"visible text", "March");

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		dropDown(year,"index","12");

		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		send_Keys(cvv, "123");

		WebElement bookNowBtn = driver.findElement(By.xpath("//input[@id='book_now']"));
		click_On_Element(bookNowBtn);

		sleep(5000);

		WebElement itineraryBtn = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		click_On_Element(itineraryBtn);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\hotel.png");

		sleep(2000);

		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		click_On_Element(checkBox);
		

		WebElement cancelBtn = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		click_On_Element(cancelBtn);

		alert("accept");

		// close();

	}
}
