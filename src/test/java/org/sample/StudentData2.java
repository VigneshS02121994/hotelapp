package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentData2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\vigne\\eclipse-workspace\\SeleniumMaven\\Excel\\TestData.xlsx");
	    FileInputStream stream = new FileInputStream(f);	
	    Workbook workbook = new XSSFWorkbook(stream);
	    Sheet sheet = workbook.getSheet("TestData");
	    
	    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	    	Row row2 = sheet.getRow(i);
	    	for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
	    		Cell c = row2.getCell(j);
	    		//System.out.println(cell2);
	    		CellType type = c.getCellType();
	    		//System.out.println(type);
	    		switch (type) {
				case STRING:
					String text = c.getStringCellValue();
					System.out.println(text);
				break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(date);
						System.out.println(format);
					}else {
						double d = c.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						//long l=(long)d;
				    	long longValue = b.longValue();
						//String valueOf = String.valueOf(l);
						String num = b.toString();
						System.out.println(longValue);
					}
					

				default:
					break;
				}
	    		
					

}
}
	}
}