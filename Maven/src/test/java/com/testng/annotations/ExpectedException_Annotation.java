package com.testng.annotations;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

import singleton.reader.classs.Facebook_File_Reader;

public class ExpectedException_Annotation {

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

	@Test(priority = 2, expectedExceptions = NoSuchElementException.class)
	public void email() throws IOException, InterruptedException {
		String email = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getEmail();
		Utility_Files.send_Keys(manager.getLp().getEmail(), email);

	}
}
