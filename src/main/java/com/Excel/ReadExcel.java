package com.Excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] readData()  {
		String excel_File_Location = "C:\\Users\\Hari\\eclipse-workspace\\com.project2\\excel\\Book1.xlsx";
		XSSFWorkbook workBook = null;
		try {
			workBook = new XSSFWorkbook(excel_File_Location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFSheet sheet = workBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		for(int i = 1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j< lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				String formatCellValue = format.formatCellValue(cell);
				data[i-1][j] = formatCellValue;
				
				}
		}
		try {
			workBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
}
