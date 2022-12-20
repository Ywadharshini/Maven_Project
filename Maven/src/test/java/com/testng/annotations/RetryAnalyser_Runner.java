package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom_manager.Facebook_Pageobject_Manager;
import com.utilityfiles.Utility_Files;
import singleton.reader.classs.Facebook_File_Reader;

public class RetryAnalyser_Runner {

	public static WebDriver driver = Utility_Files.browser_Launch("chrome");
	public static Facebook_Pageobject_Manager manager = new Facebook_Pageobject_Manager(driver);

	@Test
	public void url_Title() {

		Utility_Files.url_Launch("https://www.facebook.com/");

		String expected_Title = Utility_Files.get_Title();

		String Actual_Title = "Reddit";

		Assert.assertSame(expected_Title, Actual_Title);

		System.out.println("validation success");

	}

	@Test(priority = 1)
	public void text() throws IOException {

		Utility_Files.url_Launch("https://www.facebook.com/");

		String email = Facebook_File_Reader.getInstanceFileReader().getInstanceDataReader().getEmail();

		Utility_Files.send_Keys(manager.getLp().getEmail(), email);

		String expected_Text = Utility_Files.get_Attribute(manager.getLp().getEmail(), "value");

		String Actual_Text = "ywa@gmail.com";

		Assert.assertSame(expected_Text, Actual_Text);

		System.out.println("validation success");

	}
}
