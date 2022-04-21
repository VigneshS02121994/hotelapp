package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentsData {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("TestData");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(5);
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		int k = sheet.getPhysicalNumberOfRows();
		System.out.println(k);
		//for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			//Cell cell2 = row.getCell(i);
			//System.out.println(cell2);
			
		//}
		
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell c = row2.getCell(j);
				System.out.println(c);
				
			}
			
		}
		
			
		
		
		
	}

}
