package utils;

import org.testng.annotations.DataProvider;

import com.Excel.ReadExcel;

public class DataUtils {

	@DataProvider(name="details")
	public static String[][] getData(){
		String[][] excelData = ReadExcel.readData();
		return excelData;
	}
}
