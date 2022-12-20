package com.brokenconcept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link{

	public static WebDriver driver = WebDriverManager.chromedriver().create();

	public static void check_Links() throws MalformedURLException, IOException {

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> all_Links = driver.findElements(By.tagName("a"));
		
		System.out.println(all_Links.size());

		for (WebElement links : all_Links) {

			String link = links.getAttribute("href");

			if (link.isEmpty() || link == null || link.equalsIgnoreCase("http://www.domaindoesnot.exist") ) {
				
				continue;
			}

			URL u = new URL(link);

			URLConnection connection = u.openConnection();

			HttpURLConnection http = (HttpURLConnection) connection;

			// http.connect();

			int responseCode = http.getResponseCode();

			String responseMessage = http.getResponseMessage();

			if (responseCode >= 400) {

				System.out.println("link - " + link + "------------- code - " + responseCode
						+ "--------------- message - " + responseMessage);

			}

			http.disconnect();
		}

	}
	
	

	public static void main(String[] args) throws MalformedURLException, IOException {

		check_Links();

	}
}

