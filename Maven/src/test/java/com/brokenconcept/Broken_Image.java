package com.brokenconcept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Image {

	public static WebDriver driver = WebDriverManager.chromedriver().create();

	public static void check_Image() throws IOException {

		driver.get("https://the-internet.herokuapp.com/broken_images");

		List<WebElement> all_Images = driver.findElements(By.tagName("img"));

		System.out.println(all_Images.size());

		for (WebElement img : all_Images) {

			String image = img.getAttribute("src");

			if (image.isEmpty() || image == null) {

				continue;
			}

			URL u = new URL(image);

			URLConnection connection = u.openConnection();

			HttpURLConnection http = (HttpURLConnection) connection;

			http.connect();

			int responseCode = http.getResponseCode();

			String responseMessage = http.getResponseMessage();

			if (responseCode >= 400) {

				System.out.println("Image - " + image + "------------- code - " + responseCode
						+ "--------------- message - " + responseMessage);

			}

			http.disconnect();

		}

	}

	public static void main(String[] args) throws IOException {

		check_Image();
	}
}
