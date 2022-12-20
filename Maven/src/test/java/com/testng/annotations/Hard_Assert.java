package com.testng.annotations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;

public class Hard_Assert {

	public static WebDriver driver = Utility_Files.browser_Launch("chrome");

	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Test
	public void browser() {

		Utility_Files.url_Launch("https://www.facebook.com/");

		String expected_Title = Utility_Files.get_Title();
		
		String Actual_Title = "Reddit";

		Assert.assertSame(expected_Title, Actual_Title);
		
		System.out.println("validation success");

	}
}
