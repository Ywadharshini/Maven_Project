package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_TestCase {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Project_Cucumber\\Driver\\chromedriver.exe");;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("ywa@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("123456");
		
		WebElement login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		login_Btn.click();
		
	}

}
