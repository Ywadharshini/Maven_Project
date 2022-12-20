package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

import singleton.reader.classs.Facebook_File_Reader;

public class InvocationTimeOut_Annotation {
	
	public static WebDriver driver = Utility_Files.browser_Launch("chrome");

	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Test
	public void browser() {
		Utility_Files.url_Launch("https://www.facebook.com/");
	}

	@Test(priority = 1)
	public void maximize() {
		Utility_Files.manage_Commands("maximize");
	}

	@Test(priority = 2, invocationCount = 2 , invocationTimeOut = 500) 
	public void refresh() {
		Utility_Files.manage_Commands("refresh");
	}

	@Test(priority = 3)
	public void email() throws IOException {
		String email = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getEmail();

		Utility_Files.send_Keys(manager.getLp().getEmail(), email);

	}

	@Test(priority = 4)
	public void pass() throws IOException {

		String password = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();

		Utility_Files.send_Keys(manager.getLp().getPassword(), password);

	}

	@Test(priority = 5)
	public void loginBtn() {
		Utility_Files.click_On_Element(manager.getLp().getLoginBtn());
	}


}
