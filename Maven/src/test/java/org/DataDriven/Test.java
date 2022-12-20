package org.DataDriven;

import java.io.IOException;

import com.utilityfiles.Utility_Files;

public class Test extends Utility_Files {

	public static void main(String[] args) throws IOException {

		System.out.println("Particular cell data ");
		String value = particular_Cell_Date("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx", 0, 2, 1);
		System.out.println(value);

	}

}
