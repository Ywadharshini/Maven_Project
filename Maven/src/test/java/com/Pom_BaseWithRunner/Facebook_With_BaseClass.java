package com.Pom_BaseWithRunner;

import org.openqa.selenium.WebDriver;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

public class Facebook_With_BaseClass extends Utility_Files{
	
	public static WebDriver driver= browser_Launch("chrome");
	
	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException {
		
		manage_Commands("maximize");

		url_Launch("https://www.facebook.com/");

		send_Keys(manager.getLp().getEmail(), "ywa@gmail.com");
		
		send_Keys(manager.getLp().getPassword(), "123456");
		
		click_On_Element(manager.getLp().getLoginBtn());
		
	}

}
