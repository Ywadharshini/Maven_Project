package com.testng.annotations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pom_manager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class DataProvider_MultipleDataFromExcel extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@DataProvider
	public String[][] ReadDataFromExcel() throws IOException {

		String[][] excelData = get_All_Data("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Test data for Data provider.xlsx");

		return excelData;
		
	}

	@Test(dataProvider = "ReadDataFromExcel")
	public void userData(String data[]) throws InterruptedException {
		
		System.out.println(data[0]);
		System.out.println(data[1]);

	    manage_Commands("maximize");

		url_Launch("https://adactinhotelapp.com/");

		sleep(1000);

		send_Keys(manager.getLp().getUserName(), data[0]);

		send_Keys(manager.getLp().getPassword(), data[1]);

		click_On_Element(manager.getLp().getLoginBtn());
		
	
	}

}
