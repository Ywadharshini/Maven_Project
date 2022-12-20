package com.svg.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilityfiles.Utility_Files;

public class Svg_Elements extends Utility_Files {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browser_Launch("chrome");

		manage_Commands("maximize");

		url_Launch(
				"https://www.google.com/search?q=covid+cases+india&rlz=1C1OKWM_enZA936ZA936&oq=covid+cases+india&aqs=chrome..69i57j35i39j0i402l2j0i512j69i60l3.5860j1j7&sourceid=chrome&ie=UTF-8");

		waits("implicit wait", 20);

		List<WebElement> allData = driver
				.findElements(By.xpath("//*[name()='svg' and @ class='uch-psvg']/*[name()='g']/*[name()='rect']"));

		Actions a = new Actions(driver);

		for (WebElement data : allData) {

			a.moveToElement(data).build().perform();

			WebElement dataBox = driver.findElement(By.xpath("//div[@class='ExnoTd']"));

			if (dataBox.getText().contains("31 Jan 2022")) {

				System.out.println(dataBox.getText());

				break;
			}

		}
		close();
	}

}
