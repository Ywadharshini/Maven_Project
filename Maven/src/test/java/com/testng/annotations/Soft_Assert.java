package com.testng.annotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

public class Soft_Assert {
	public static WebDriver driver = Utility_Files.browser_Launch("chrome");

	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Test
	public void browser() {

		Utility_Files.url_Launch("https://www.facebook.com/");

		String expected_Title = Utility_Files.get_Title();
		
		String Actual_Title = "Reddit";
		
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(Actual_Title, expected_Title);
		
		soft.assertAll();
		
		System.out.println("validation success");

	}
}
