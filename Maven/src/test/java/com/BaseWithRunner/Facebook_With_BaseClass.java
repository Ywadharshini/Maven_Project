package com.BaseWithRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilityfiles.Utility_Files;

public class Facebook_With_BaseClass extends Utility_Files{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = browser_Launch("chrome");

		manage_Commands("maximize");

		url_Launch("https://www.facebook.com/");

		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		send_Keys(mail, "ywa@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		send_Keys(pass, "123456");
		
		WebElement login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		click_On_Element(login_Btn);
	}

}
