package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

import singleton.reader.classs.Facebook_File_Reader;

public class Group_Annotation {
	public static WebDriver driver = Utility_Files.browser_Launch("chrome");

	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Test(groups = "user data")
	public void browser() {
		Utility_Files.url_Launch("https://www.facebook.com/");
	}

	@Test(groups = "managecommands")
	public void maximize() {
		Utility_Files.manage_Commands("maximize");
	}

	@Test(groups = "managecommands")
	public void refresh() {
		Utility_Files.manage_Commands("refresh");
	}

	@Test(groups = "user data")
	public void email() throws IOException {
		String email = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getEmail();

		Utility_Files.send_Keys(manager.getLp().getEmail(), email);

	}

	@Test(groups = "data")
	public void pass() throws IOException {

		String password = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getPassword();

		Utility_Files.send_Keys(manager.getLp().getPassword(), password);

	}

	@Test(groups = "data")
	public void loginBtn() {
		Utility_Files.click_On_Element(manager.getLp().getLoginBtn());
	}

}
