package com.runner;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_MiniProject {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\dr\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

		Thread.sleep(1000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Ywadharshini");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("junnu06");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login']"));
		loginBtn.click();

		Thread.sleep(3000);

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByVisibleText("London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);

		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(roomType);
		s2.selectByValue("Standard");

		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(noOfRooms);
		s3.selectByValue("2");

		WebElement checkInDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkInDate.clear();
		checkInDate.sendKeys("16/10/2022");

		WebElement checkOutDate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		checkOutDate.clear();
		checkOutDate.sendKeys("25/10/2022");

		WebElement adultPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adultPerRoom);
		s4.selectByIndex(2);

		WebElement childPerRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(childPerRoom);
		s5.selectByValue("2");

		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		searchBtn.click();

		Thread.sleep(1000);

		WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio']"));
		radioBtn.click();

		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstName.sendKeys("Ywa");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("dharshini");

		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("XYZ, Salem");

		WebElement cardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardNo.sendKeys("1111111111111111");

		WebElement cardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6 = new Select(cardType);
		s6.selectByValue("MAST");

		WebElement exp_Date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7 = new Select(exp_Date);
		s7.selectByVisibleText("March");

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(year);
		s8.selectByIndex(12);

		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("123");

		WebElement bookNowBtn = driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNowBtn.click();
		
		Thread.sleep(5000);

		WebElement itineraryBtn = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		itineraryBtn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\_Selinium_Project\\Screenshot\\Hotelbooking.png");
		FileUtils.copyFile(source, des);
		
		Thread.sleep(2000);

		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkBox.click();

		WebElement cancelBtn = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		cancelBtn.click();
		
		driver.switchTo().alert().accept();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
