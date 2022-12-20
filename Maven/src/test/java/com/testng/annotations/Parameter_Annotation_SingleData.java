package com.testng.annotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

public class Parameter_Annotation_SingleData {

	public static WebDriver driver = Utility_Files.browser_Launch("chrome");

	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Parameters({ "URL" })
	@Test
	public void browser(String path) {
		Utility_Files.url_Launch(path);
	}

	@Parameters({ "mail", "pass" })
	@Test
	public void credentials(String email, String password) {

		Utility_Files.send_Keys(manager.getLp().getEmail(), email);
		Utility_Files.send_Keys(manager.getLp().getPassword(), password);

	}
}
