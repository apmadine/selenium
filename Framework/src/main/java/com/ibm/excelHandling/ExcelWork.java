package com.ibm.excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWork {

	static XSSFSheet sheetObj;
	static FileInputStream fiObj;

	public static void configExcel() throws IOException {

		String excelFilePath = "Inputs\\TestData.xlsx";
		fiObj = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook wbObj = new XSSFWorkbook(fiObj);
		sheetObj = wbObj.getSheetAt(0); // Sheet Index starts with 0
	}

	public static String getCellData(int rowNumber, int columnNumber) {

		return sheetObj.getRow(rowNumber).getCell(columnNumber).toString();
	}

	public static void closeFile() throws IOException {
		fiObj.close();
	}

}
