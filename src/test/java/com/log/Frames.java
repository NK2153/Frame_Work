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

public class Frames {
	public static void main(String[] args) throws IOException {
		File aa = new File("C:\\Users\\ELCOT\\Downloads\\Book1.xlsx");
		FileInputStream bb = new FileInputStream(aa);

		Workbook cc = new XSSFWorkbook(bb);
		Sheet sheet = cc.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue + "\t");
					break;

				default:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						String format = df.format(dateCellValue);
						System.out.print(format + "\t");

					} else {
						double numericCellValue = cell.getNumericCellValue();
						System.out.print(numericCellValue + "\t");
					}
					break;
				}

			}
			System.out.println("");
		}
	}

}
