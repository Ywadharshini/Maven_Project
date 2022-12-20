package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.utilityfiles.Utility_Files;


public class Parallel_Testing {

	public static WebDriver driver;

	@BeforeClass
	public void browser() {
		
		driver = Utility_Files.browser_Launch("chrome");
	}

	@Test 
	public void fb() throws IOException {
		
		Utility_Files.url_Launch("https://www.facebook.com/");
		
	}

	@Test
	public void instagram() throws IOException {
		Utility_Files.url_Launch("https://www.instagram.com/");
	}

}
