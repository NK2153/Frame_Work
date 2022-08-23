package com.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Frames2{
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\Downloads\\Book123.xlsx");
		FileInputStream steam = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(steam);
		Sheet sheet = book.getSheet("Sheet1");
		
		for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			
			for(int j=0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
			
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;

				default:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat();
						String format = s.format(dateCellValue);
						System.out.println(format);
					} else {

					
					double numericCellValue = cell.getNumericCellValue();
					String string = Double.toString(numericCellValue);
					System.out.println(string);
					
					break;
				}}
			
			
			
			}
		}
		
	}
}
