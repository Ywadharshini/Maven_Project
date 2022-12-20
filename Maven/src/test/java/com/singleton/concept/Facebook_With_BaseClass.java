package com.singleton.concept;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

import singleton.reader.classs.Facebook_File_Reader;

public class Facebook_With_BaseClass extends Utility_Files{
	
	public static WebDriver driver= browser_Launch("chrome");
	
	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		manage_Commands("maximize");

		url_Launch("https://www.facebook.com/");
		
		String email = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getEmail();

		send_Keys(manager.getLp().getEmail(), email);
		
		String password = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();
		
		send_Keys(manager.getLp().getPassword(), password);
		
		click_On_Element(manager.getLp().getLoginBtn());
		
	}

}
