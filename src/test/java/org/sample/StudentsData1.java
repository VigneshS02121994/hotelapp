package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentsData1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\TestData.xlsx");
	    FileInputStream stream = new FileInputStream(f);	
	    Workbook workbook = new XSSFWorkbook(stream);
	    Sheet sheet = workbook.getSheet("TestData");
	    //Row row = sheet.getRow(3);
	    //Cell cell = row.getCell(3);
	    //System.out.println(cell);
	    //int i = row.getPhysicalNumberOfCells();
	    //System.out.println(i);
	    //int j = sheet.getPhysicalNumberOfRows();
	    //System.out.println(j);
	    for (int j2 = 0; j2 < sheet.getPhysicalNumberOfRows(); j2++) {
	    	Row row = sheet.getRow(j2);
	    	for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {
	    		Cell cell2 = row.getCell(k);
	    		//System.out.println(cell2);
	    		CellType type = cell2.getCellType();
	    		//System.out.println(type);
	    		switch (type) {
				case STRING:
					String value = cell2.getStringCellValue();
					System.out.println(value);
					break;
				case NUMERIC:
					double value2 = cell2.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(value2);
					String string = valueOf.toString();
					System.out.println(string);
					break;
				default:
					break;
				}
	    		
				
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	}
		}
	    
	    
		}
	    
	    
	}
	


