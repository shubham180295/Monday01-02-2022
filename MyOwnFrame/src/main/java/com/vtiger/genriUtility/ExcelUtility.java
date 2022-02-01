package com.vtiger.genriUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getExcelSheet(String sheet, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./data/TestScript1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheet);
	 Row r = sh.getRow(rownum);
	String data = r.getCell(cellnum).getStringCellValue();
	 wb.close();
	 return data;
	}
	public int getlastRow(String sheet) throws IOException {
		FileInputStream fis =new FileInputStream("./data/TestScript1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		wb.close();
		return sh.getLastRowNum();
	}
	public void setDataExcel(String sheetName , int rowNum, int celNum ,String data) throws Throwable {
		FileInputStream fis  = new FileInputStream("./data/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/TestScript1.xlsx");
		wb.write(fos);
		wb.close();
		
	}
	

}


