package org.DataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriven_Write {
	
	public static Logger log = Logger.getLogger(DataDriven_Write.class);
	
	public static  void writeData(String sheetName) throws IOException {
		
		BasicConfigurator.configure();

		File f = new File("D:\\Java with selenium\\Project\\Writedata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet(sheetName).createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet(sheetName).getRow(0).createCell(1).setCellValue("Number");
		wb.getSheet(sheetName).createRow(1).createCell(0).setCellValue("Ywa");
		wb.getSheet(sheetName).getRow(1).createCell(1).setCellValue("01");
		wb.getSheet(sheetName).createRow(2).createCell(0).setCellValue("dharshini");
		wb.getSheet(sheetName).getRow(2).createCell(1).setCellValue("02");
		wb.getSheet(sheetName).createRow(3).createCell(0).setCellValue("priya");
		wb.getSheet(sheetName).getRow(3).createCell(1).setCellValue("03");
		wb.getSheet(sheetName).createRow(4).createCell(0).setCellValue("maha");
		wb.getSheet(sheetName).getRow(4).createCell(1).setCellValue("04");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		log.info("Data Passed");
				
	}
	
	public static void main(String[] args) throws IOException {
		
		writeData("Data");
	}

}
