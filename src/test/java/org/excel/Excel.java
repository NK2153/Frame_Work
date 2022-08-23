package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {

		List<String> li = new LinkedList<String>();

		li.add("nk");
		li.add("mersal");
		li.add("kn");
		li.add("Don");

		List<String> l = new LinkedList<String>();

		l.add("s32456");
		l.add("jhbuy");
		l.add("887");
		l.add("0987");

		int size = li.size();
		int size2 = l.size();

		File f = new File("D:\\Files\\Mersal.xlsx");

		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet();

		for (int i = 0; i < size; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < 1; j++) {
				Cell cell = row.createCell(j);

				cell.setCellValue(li.get(i));

				for (int k = 1; k < 2; k++) {
					Cell cell1 = row.createCell(j + 1);
					cell1.setCellValue(l.get(i));

					FileOutputStream fs = new FileOutputStream(f);
					book.write(fs);

				}

			}

		}

	}

}
