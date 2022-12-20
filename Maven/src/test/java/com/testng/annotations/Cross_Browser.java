package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class Cross_Browser {
	
	public static WebDriver driver;


	@Test 
	public void fb() throws IOException {
		
		driver = Utility_Files.browser_Launch("chrome");
		
		Utility_Files.url_Launch("https://www.facebook.com/");
		
	}

	@Test
	public void instagram() throws IOException {
		
		driver = Utility_Files.browser_Launch("opera");
		
		Utility_Files.url_Launch("https://www.instagram.com/");
	}


}
