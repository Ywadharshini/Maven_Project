package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utilityfiles.Utility_Files;

public class DataDriven_Read extends Utility_Files {

	public static void particular_Cell_Date() throws IOException {

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(2);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String value = c.getStringCellValue();
			System.out.println(value);
		} else if (type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();
			// double to int
			int a = (int) d; // int to string
			String value = String.valueOf(a);
			System.out.println(value);
		}

		wb.close();

	}

	public static void particular_Column_Data() throws IOException {

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int rowCount = s.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {

			Row row = s.getRow(i);
			Cell cell = row.getCell(1);

			CellType type = cell.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (type.equals(CellType.NUMERIC)) {

				double d = cell.getNumericCellValue();
				// double to int
				int a = (int) d;
				// int to string
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}

		wb.close();

	}

	public static void particular_Row_Data() throws IOException {

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row row = s.getRow(3);

		int cellCount = row.getPhysicalNumberOfCells();

		for (int i = 0; i < cellCount; i++) {

			Cell cell = row.getCell(i);

			CellType type = cell.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();
				System.out.print(value + "  ");
			} else if (type.equals(CellType.NUMERIC)) {

				double d = cell.getNumericCellValue();
				// double to int
				int a = (int) d;
				// int to string
				String value = String.valueOf(a);
				System.out.print(value + "  ");
			}
		}

		wb.close();
	}

	public static void get_All_Data() throws IOException {

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int rowCount = s.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {

			Row row = s.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellCount; j++) {

				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();

				if (type.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();
					System.out.print(value + "  ");
				} else if (type.equals(CellType.NUMERIC)) {

					double d = cell.getNumericCellValue();
					// double to int
					int a = (int) d;
					// int to string
					String value = String.valueOf(a);
					System.out.print(value + "  ");
				}

			}
			System.out.println();
		}

		wb.close();

	}

	public static void main(String[] args) throws IOException {

		System.out.println("Particular cell data ");
		String value = particular_Cell_Date("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\data.xlsx", 0, 2, 1);
		System.out.println(value);
		System.out.println("\n--------------------");

		System.out.println("Particular Row data ");
		particular_Row_Data();
		System.out.println("\n\n--------------------");

		System.out.println("Particular column data ");
		particular_Column_Data();
		System.out.println("\n-------------------------");

		System.out.println("All data");
		get_All_Data();
		
	}

}
