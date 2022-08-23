package com.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowColom {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\ELCOT\\Downloads\\Book12.xlsx");
	FileInputStream stream = new FileInputStream(f);
	
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
		String stringCellValue = cell.getStringCellValue();
		System.out.print
		(stringCellValue + "\t");
		}
		System.out.println("");
	}
}
}
